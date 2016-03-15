package app.base.plugin;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;

import java.util.List;

public class BatchPlugin extends PluginAdapter{
	
	@Override
	public boolean validate(List<String> warnings) {
		return true;
	}
	
	@Override
	public boolean clientGenerated(Interface interfaze,TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		
		String name = interfaze.getType().getShortName();
		name = name.replace("Mapper","");
		
		this.addBatchMethod(interfaze,"Insert",name);
		this.addBatchMethod(interfaze,"UpdateByPrimaryKey",name);
		this.addBatchMethod(interfaze,"DeleteByPrimaryKey","String");
		
		return super.clientGenerated(interfaze, topLevelClass, introspectedTable);
	}
	
	@Override
	public boolean sqlMapDocumentGenerated(Document document,IntrospectedTable introspectedTable) {
		this.insertBatchXML(document, introspectedTable);
		this.updateBatchXML(document, introspectedTable);
		this.deleteBatchXML(document, introspectedTable);
		return super.sqlMapDocumentGenerated(document, introspectedTable);
	}

	private void addBatchMethod(Interface interfaze,String type,String name){
		Method method = new Method("batch"+type);
		FullyQualifiedJavaType ft = new FullyQualifiedJavaType("List<"+name+">");
		Parameter parameter = new Parameter(ft,"records");
		parameter.addAnnotation("@Param(\"records\")");
		method.addParameter(parameter);
		interfaze.addMethod(method);
	}
	
	private void insertBatchXML(Document document,IntrospectedTable introspectedTable){
		XmlElement element = document.getRootElement();
		XmlElement addElement = new XmlElement("insert");
		addElement.addAttribute(new Attribute("id","batchInsert"));
		addElement.addAttribute(new Attribute("parameterType","java.util.List"));
		
		XmlElement eachElement = new XmlElement("foreach");
		eachElement.addAttribute(new Attribute("collection","records"));
		eachElement.addAttribute(new Attribute("item","record"));
		eachElement.addAttribute(new Attribute("index","index"));
		eachElement.addAttribute(new Attribute("separator",";"));
		
		StringBuffer sb = new StringBuffer("insert into "+introspectedTable.getTableConfiguration().getTableName()+" (");
		List<IntrospectedColumn> columns = introspectedTable.getAllColumns();
		for(int i=0;i<columns.size();i++){
			IntrospectedColumn column = columns.get(i);
			sb.append(column.getActualColumnName());
			if(i < columns.size()-1){
				sb.append(",");
			}
		}
		sb.append(")");
		sb.append(" values ");
		sb.append("(");
		for(int i=0;i<columns.size();i++){
			IntrospectedColumn column = columns.get(i);
			sb.append("#{record."+column.getJavaProperty()+",jdbcType="+column.getJdbcTypeName()+"}");
			if(i < columns.size()-1){
				sb.append(",");
			}
		}
		sb.append(")");
		TextElement content = new TextElement(sb.toString());
		eachElement.addElement(content);
		
		addElement.addElement(eachElement);
		element.addElement(addElement);
	}
	
	private void updateBatchXML(Document document,IntrospectedTable introspectedTable){
		XmlElement element = document.getRootElement();
		XmlElement addElement = new XmlElement("update");
		addElement.addAttribute(new Attribute("id","batchUpdateByPrimaryKey"));
		addElement.addAttribute(new Attribute("parameterType","java.util.List"));
		
		XmlElement eachElement = new XmlElement("foreach");
		eachElement.addAttribute(new Attribute("collection","records"));
		eachElement.addAttribute(new Attribute("item","record"));
		eachElement.addAttribute(new Attribute("index","index"));
		eachElement.addAttribute(new Attribute("separator",";"));
		
		StringBuffer sb = new StringBuffer("update "+introspectedTable.getTableConfiguration().getTableName()+" ");
		sb.append("set ");
		List<IntrospectedColumn> columns = introspectedTable.getAllColumns();
		for(int i=0;i<columns.size();i++){
			IntrospectedColumn column = columns.get(i);
			if(column.isIdentity()){
				continue;
			}
			sb.append(column.getActualColumnName() + "=" + "#{record."+column.getJavaProperty()+",jdbcType="+column.getJdbcTypeName()+"}");
			if(i < columns.size()-1){
				sb.append(",");
			}
		}
		List<IntrospectedColumn> pks = introspectedTable.getPrimaryKeyColumns();
		if(null != pks && pks.size()>0){
			sb.append(" where ");
			for(int i=0;i<pks.size();i++){
				IntrospectedColumn column = pks.get(i);
				sb.append(column.getActualColumnName() + "=" + "#{record."+column.getJavaProperty()+",jdbcType="+column.getJdbcTypeName()+"}");
				if(i < pks.size()-1){
					sb.append(",");
				}
			}
		}
		TextElement content = new TextElement(sb.toString());
		eachElement.addElement(content);
		
		addElement.addElement(eachElement);
		element.addElement(addElement);
	}
	
	private void deleteBatchXML(Document document,IntrospectedTable introspectedTable){
		XmlElement element = document.getRootElement();
		XmlElement addElement = new XmlElement("delete");
		addElement.addAttribute(new Attribute("id","batchDeleteByPrimaryKey"));
		addElement.addAttribute(new Attribute("parameterType","java.util.List"));
		
		XmlElement eachElement = new XmlElement("foreach");
		eachElement.addAttribute(new Attribute("collection","records"));
		eachElement.addAttribute(new Attribute("item","record"));
		eachElement.addAttribute(new Attribute("index","index"));
		eachElement.addAttribute(new Attribute("separator",";"));
		
		StringBuffer sb = new StringBuffer("delete from "+introspectedTable.getTableConfiguration().getTableName()+" ");
		List<IntrospectedColumn> pks = introspectedTable.getPrimaryKeyColumns();
		if(null != pks && pks.size()>0){
			sb.append(" where ");
			for(int i=0;i<pks.size();i++){
				IntrospectedColumn column = pks.get(i);
				sb.append(column.getActualColumnName() + "=" + "#{record}");
				if(i < pks.size()-1){
					sb.append(",");
				}
			}
		}
		TextElement content = new TextElement(sb.toString());
		eachElement.addElement(content);
		
		addElement.addElement(eachElement);
		element.addElement(addElement);
	}
	
}
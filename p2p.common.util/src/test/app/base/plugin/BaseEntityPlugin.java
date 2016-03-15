package app.base.plugin;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.*;

import java.util.List;

public class BaseEntityPlugin extends PluginAdapter{
	
	@Override
	public boolean validate(List<String> arg0) {
		return true;
	}

	//取消 基类存在的三个属性项
	@Override
	public boolean modelFieldGenerated(Field field, TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn, IntrospectedTable introspectedTable, ModelClassType modelClassType) {
//		if(		field.getName().equals("dataId") ||
//				field.getName().equals("dataEnable") ||
//				field.getName().equals("dataInsertTime") ||
//				field.getName().equals("dataUpdateTime") ||
//				field.getName().equals("dataDeleteTime") ||
//				field.getName().equals("extensionA") ||
//				field.getName().equals("extensionB") ||
//				field.getName().equals("extensionC") ||
//				field.getName().equals("extensionD") ||
//				field.getName().equals("extensionE") ||
//				field.getName().equals("extensionF")
//		){
//			return false;
//		}
//		String name = introspectedTable.getTableConfiguration().getTableName();
//		name = name.toUpperCase();
//		name = name.replace("TB","EE");
//		name = name.replaceAll("_","-");
//		field.addJavaDocLine("//"+introspectedColumn.getRemarks());
//		if(!introspectedColumn.isNullable()){
//			topLevelClass.addImportedType("net.sf.oval.constraint.NotNull");
//			topLevelClass.addImportedType("net.sf.oval.constraint.NotEmpty");
//			field.addAnnotation("@NotNull(errorCode=\""+name+"-\")");
//			field.addAnnotation("@NotEmpty(errorCode=\""+name+"-\")");
//		}
//		if(introspectedColumn.isStringColumn()){
//			topLevelClass.addImportedType("net.sf.oval.constraint.Length");
//			if(introspectedColumn.isNullable()){
//				field.addAnnotation("@Length(min=0,max="+introspectedColumn.getLength()+",errorCode=\""+name+"-\")");
//			}else{
//				field.addAnnotation("@Length(min=1,max="+introspectedColumn.getLength()+",errorCode=\""+name+"-\")");
//			}
//		}
		return super.modelFieldGenerated(field, topLevelClass, introspectedColumn, introspectedTable, modelClassType);
	}

	//取消 基类存在的三个属性项
	@Override
	public boolean modelGetterMethodGenerated(Method method,TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn,IntrospectedTable introspectedTable, ModelClassType modelClassType) {
//		if(method.getName().equals("getDataId") ||
//				method.getName().equals("getDataEnable") ||
//				method.getName().equals("getDataInsertTime") ||
//				method.getName().equals("getDataUpdateTime") ||
//				method.getName().equals("getDataDeleteTime") ||
//				method.getName().equals("getExtensionA") ||
//				method.getName().equals("getExtensionB") ||
//				method.getName().equals("getExtensionC") ||
//				method.getName().equals("getExtensionD") ||
//				method.getName().equals("getExtensionE") ||
//				method.getName().equals("getExtensionF")){
//			return false;
//		}
		return super.modelGetterMethodGenerated(method, topLevelClass,introspectedColumn, introspectedTable, modelClassType);
	}

	//取消 基类存在的三个属性项
	@Override
	public boolean modelSetterMethodGenerated(Method method,TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn,IntrospectedTable introspectedTable, ModelClassType modelClassType) {
//		if(method.getName().equals("setDataId") ||
//				method.getName().equals("setDataEnable") ||
//				method.getName().equals("setDataInsertTime") ||
//				method.getName().equals("setDataUpdateTime") ||
//				method.getName().equals("setDataDeleteTime") ||
//				method.getName().equals("setExtensionA") ||
//				method.getName().equals("setExtensionB") ||
//				method.getName().equals("setExtensionC") ||
//				method.getName().equals("setExtensionD") ||
//				method.getName().equals("setExtensionE") ||
//				method.getName().equals("setExtensionF")){
//			return false;
//		}
		return super.modelSetterMethodGenerated(method, topLevelClass,introspectedColumn, introspectedTable, modelClassType);
	}
	
	//设置实体类继承基类
	@Override
	public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass,IntrospectedTable introspectedTable) {
		IntrospectedColumn col = introspectedTable.getColumn("data_enable");
//		if(null == col){
//			topLevelClass.addImportedType("com.hl.utils.base.entity.BaseEntity");
//			topLevelClass.setSuperClass("BaseEntity");
//		}
//
		Field field = new Field();//添加序列化编号
		field.setName("serialVersionUID");
		field.setStatic(true);
		field.setFinal(true);
		field.setInitializationString("1L");
		field.setVisibility(JavaVisibility.PRIVATE);
		field.setType(new FullyQualifiedJavaType("long"));
		topLevelClass.addField(field);
		
		return super.modelBaseRecordClassGenerated(topLevelClass, introspectedTable);
	}
	
}
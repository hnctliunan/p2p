package app.base.plugin;

import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;

import java.util.List;

public class MySQLPapperPlugin extends PluginAdapter{
	@Override
	public boolean validate(List<String> arg0) {
		return true;
	}
	
	@Override
	public boolean modelExampleClassGenerated(TopLevelClass topLevelClass,IntrospectedTable introspectedTable) {
		addPage(topLevelClass,introspectedTable,"pageSet");
		return super.modelExampleClassGenerated(topLevelClass,introspectedTable);
	}
	
	@Override
	public boolean clientGenerated(Interface interfaze,TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
//		interfaze.addImportedType(new FullyQualifiedJavaType("com.base.dao.BaseDao"));
//		interfaze.addSuperInterface(new FullyQualifiedJavaType("BaseDao"));
		return super.clientGenerated(interfaze, topLevelClass, introspectedTable);
	}

	@Override
	public boolean sqlMapDocumentGenerated(Document document,IntrospectedTable introspectedTable) {
		XmlElement parentElement = document.getRootElement();
		// 产生分页语句前半部分
		XmlElement paginationPrefixElement = new XmlElement("sql");
		paginationPrefixElement.addAttribute(new Attribute("id","MySQLDialectPrefix"));
		XmlElement pageStart = new XmlElement("if");
		pageStart.addAttribute(new Attribute("test","pageSet != null"));
		pageStart.addElement(new TextElement("select * from ( "));
		paginationPrefixElement.addElement(pageStart);
		parentElement.addElement(paginationPrefixElement);
		// 产生分页语句后半部分
		XmlElement paginationSuffixElement = new XmlElement("sql");
		paginationSuffixElement.addAttribute(new Attribute("id","MySQLDialectSuffix"));
		XmlElement pageEnd = new XmlElement("if");
		pageEnd.addAttribute(new Attribute("test", "pageSet != null"));
		pageEnd.addElement(new TextElement("<![CDATA[ ) as _TB limit #{pageSet.start},#{pageSet.limit} ]]>"));
		paginationSuffixElement.addElement(pageEnd);
		parentElement.addElement(paginationSuffixElement);
		return super.sqlMapDocumentGenerated(document, introspectedTable);
	}

	@Override
	public boolean sqlMapSelectByExampleWithoutBLOBsElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
		XmlElement pageStart = new XmlElement("include");
		pageStart.addAttribute(new Attribute("refid", "MySQLDialectPrefix"));
		element.getElements().add(0, pageStart);
		XmlElement isNotNullElement = new XmlElement("include");
		isNotNullElement.addAttribute(new Attribute("refid","MySQLDialectSuffix"));
		element.getElements().add(isNotNullElement);
		return super.sqlMapUpdateByExampleWithoutBLOBsElementGenerated(element,introspectedTable);
	}

	private void addPage(TopLevelClass topLevelClass,IntrospectedTable introspectedTable, String name) {
		topLevelClass.addImportedType(new FullyQualifiedJavaType("com.base.util.papper.PageSet"));
		CommentGenerator commentGenerator = context.getCommentGenerator();
		Field field = new Field();
		field.setVisibility(JavaVisibility.PROTECTED);
		field.setType(new FullyQualifiedJavaType("com.base.util.papper.PageSet"));
		field.setName(name);
		commentGenerator.addFieldComment(field, introspectedTable);
		topLevelClass.addField(field);
		char c = name.charAt(0);
		String camel = Character.toUpperCase(c) + name.substring(1);
		Method method = new Method();
		method.setVisibility(JavaVisibility.PUBLIC);
		method.setName("set" + camel);
		method.addParameter(new Parameter(new FullyQualifiedJavaType("com.base.util.papper.PageSet"), name));
		method.addBodyLine("this." + name + "=" + name + ";");
		commentGenerator.addGeneralMethodComment(method, introspectedTable);
		topLevelClass.addMethod(method);
		method = new Method();
		method.setVisibility(JavaVisibility.PUBLIC);
		method.setReturnType(new FullyQualifiedJavaType("com.base.util.papper.PageSet"));
		method.setName("get" + camel);
		method.addBodyLine("return " + name + ";");
		commentGenerator.addGeneralMethodComment(method, introspectedTable);
		topLevelClass.addMethod(method);
	}
}
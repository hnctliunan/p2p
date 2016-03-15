package app.base.util;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.util.ArrayList;
import java.util.List;

public class GenCode {
	
	public static void main(String[] args){
		try {
			List<String> warnings = new ArrayList<String>();
			ConfigurationParser cp = new ConfigurationParser(warnings);
			boolean overwrite = true;
			Configuration config = cp.parseConfiguration(GenCode.class.getResourceAsStream("/config.xml"));
			DefaultShellCallback callback = new DefaultShellCallback(overwrite);
			MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,callback, warnings);
			myBatisGenerator.generate(null);
			System.out.println(warnings);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
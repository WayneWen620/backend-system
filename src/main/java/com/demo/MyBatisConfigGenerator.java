package com.demo;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;


public class MyBatisConfigGenerator {

	public static void main(String[] args) throws Exception {
		System.out.println("test");
		List<String> warnings = new ArrayList<>(2);
		ConfigurationParser cp = new ConfigurationParser(warnings);
		File configFile = new File("src/main/resources/generatorConfig.xml");
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(true);
		MyBatisGenerator  myBatisGenerator= new MyBatisGenerator(config, callback, warnings);
		myBatisGenerator.generate(null);
	}
}

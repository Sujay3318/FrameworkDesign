package com.framework;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesLoader {
	
	public static PropertiesLoader instance = null;
	
	public static PropertiesLoader getInstance() {
		if(instance == null) {
			instance = new PropertiesLoader();
		}
		return instance;
	}
	
	public Properties getProperties(String sFileName) {
		Properties p = new Properties();
		FileReader fr;
		try {
			fr = new FileReader(sFileName);
			p.load(fr);
		} catch (Exception e) {			
			e.printStackTrace();
		}		
		return p;
		
	}

}

package UTILS;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	
	public static Properties pro;
	
	public static String getConfigFile(String Key) throws IOException {
		String configpath="C:\\Users\\Akash\\eclipse-workspace\\test4\\SDET24\\Config\\config";
		FileInputStream fis=new FileInputStream(configpath);
		pro=new Properties();
		pro.load(fis);
		return pro.getProperty(Key);
		
		
		
		
	}

}

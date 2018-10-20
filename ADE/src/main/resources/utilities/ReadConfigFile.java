package com.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadConfigFile {
	
	public static String url=null;
	public static String browserType=null;
	public static String userid=null;
	public static String password=null;
	public static String host=null;
	public static String port=null;
	public static String servicename=null;
	public static String dbuid=null;
	public static String dbpwd=null;
	public static String checkeruserid=null;
	public static String checkerpassword=null;
	
	public static void readConfig(){
		
		Properties prop = new Properties();
		
		InputStream input = null;
		
		String configfilename = "src\\main\\resources\\Config.properties";
		
		try{
			input = new FileInputStream(configfilename);
			
			// load a properties file ++
			prop.load(input);
			
			//get the properties values
			ReadConfigFile.url = prop.getProperty("atfw_url");
			ReadConfigFile.browserType = prop.getProperty("atfw_Browsertype");
			ReadConfigFile.url = prop.getProperty("atfw_Userid");
			ReadConfigFile.url = prop.getProperty("atfw_Password");
			ReadConfigFile.url = prop.getProperty("atfw_host");
			ReadConfigFile.url = prop.getProperty("atfw_port");
			ReadConfigFile.url = prop.getProperty("atfw_servicename");
			ReadConfigFile.url = prop.getProperty("atfw_dbuid");
			ReadConfigFile.url = prop.getProperty("atfw_dbpwd");
			ReadConfigFile.url = prop.getProperty("atfw_checkerUserid");
			ReadConfigFile.url = prop.getProperty("atfw_checkerPassword");
		
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			if(input != null){
				try{
					input.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
	}

}

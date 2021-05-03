package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class LoadConfigs {
	public static String strBrowser;
	public static String strURL;
	public static void getConfigs()
	{
		Properties prop=new Properties();
		try {
			InputStream file=new FileInputStream("C:\\Workspace\\Training\\src\\config\\config.properties");
			prop.load(file);
			strBrowser=prop.getProperty("Browser");	
			strURL=prop.getProperty("URL");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

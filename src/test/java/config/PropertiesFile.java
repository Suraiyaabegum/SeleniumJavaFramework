package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {
	
	static Properties prop= new Properties();

	public static void main(String[] args) {
		getProperties();
		setProperties();
		getProperties();
	}
	
	public static void getProperties()     {	
		try {
			
			InputStream input= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\config\\config.properties");
			prop.load(input);
			System.out.println(prop.getProperty("brower"));
		} 
		catch (Exception e) {
		
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}	
	}
	public static void setProperties()   {
		try {
			OutputStream  output=new FileOutputStream(System.getProperty("user.dir")+"\\src\\test\\java\\config\\config.properties");
			prop.setProperty("brower", "chrome");
			prop.store(output, null);   // to store value in the Properties file 
			
		} catch (Exception e) {
			
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}

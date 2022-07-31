package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public String getData(String Key) throws IOException {
		// create file input stream object for the properties file
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\Config.properties");
		// create Properties class object to access properties file
		Properties prop = new Properties();
		// load the properties file
		prop.load(fis);
		String value=(String) prop.get(Key);
		return value;
	}
	
	public static void main(String args[]) throws IOException {
		ReadProperties obj=new ReadProperties();
		obj.getData("url");
	}
}

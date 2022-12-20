package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertyFile {
	
	public static String getCredentials(String propName)
	{
		FileInputStream fis;
		String value=null;
		try {
			fis = new FileInputStream("src/test/resources/credentials.properties");
			Properties prop = new Properties();
			prop.load(fis);
			value= prop.getProperty(propName);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return value;
	}

}

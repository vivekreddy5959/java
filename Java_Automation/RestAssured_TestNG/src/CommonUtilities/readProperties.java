package CommonUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readProperties {
	
	
	public static String readDatafromProperties(String key) throws IOException {
		Properties prop=new Properties();
		String path=System.getProperties().getProperty("user.dir");
		FileInputStream fis=new FileInputStream(path + "/src/resources/config.properties");
		prop.load(fis);
		return prop.getProperty(key);
	}
	
//	public static void main(String[] args) throws IOException {
//		System.out.println(readDatafromProperties("baseURI"));;
//		
//		
//	}
}

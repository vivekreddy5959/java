package CommonUtilities;

import java.io.IOException;

import org.testng.annotations.BeforeTest;

/**
 * 
 */
public class createURL {
	
	public static String baseURI="";
	
	public static String getBaseURI() throws IOException {
		return baseURI=readProperties.readDatafromProperties("baseURI");
	}
@BeforeTest
	public static String getBaseURI(String resourcePath) throws IOException {
		return getBaseURI()+resourcePath;
		
	}
}

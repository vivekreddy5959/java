package TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.Base;
import CommonUtilities.createURL;
import CommonUtilities.readProperties;
import CommonUtilities.readfilejsoncommon;
import io.restassured.response.Response;

public class TC1_Test {
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(TC1_Test.class);

     
	 @BeforeClass
	    public void beforeClass() {
	        System.out.println("BeforeClass executed");
	    }

	    @BeforeTest
	    public void beforeTest() {
	        System.out.println("BeforeTest executed");
	    }

	    @AfterClass
	    public void afterClass() {
	        System.out.println("AfterClass executed");
	    }

	    @BeforeMethod
	    public void beforeMethod() {
	        System.out.println("BeforeMethod executed");
	    }

	    @AfterMethod
	    public void afterMethod() {
	        System.out.println("AfterMethod executed");
	    }
	@Test
	public void testcase01() throws Exception {
		   logger.info("Starting the test...");
		String resource=readProperties.readDatafromProperties("endpoint1");
		System.out.println("Printing endpoint value : " + resource);
		String BaseURI= createURL.getBaseURI(resource);
		Response res=Base.getRequest(BaseURI);
		String actualValue=readfilejsoncommon.getThejsonValue(res, "userId[0]");
		AssertJUnit.assertEquals(actualValue, "1");
		logger.info("Test completed sucessfully");
	}
	
	  @AfterTest
	    public void AfterTest() {
	        System.out.println("@AfterTest executed");
	    }
}

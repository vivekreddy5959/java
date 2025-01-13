package Base;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestTestNg {
	
	@Test
	@BeforeSuite
	public void test() {
		org.apache.log4j.PropertyConfigurator.configure("./src/resources/log4j.properties");
		System.out.println("Before suite executed");
	}
	

	    

	@Test
	@AfterSuite
	public void test1() {
		System.out.println("AfterSuite suite executed");
	}

}

package TestCases;

import org.testng.annotations.Test;
import java.io.IOException;

import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import Base.Base;
import CommonUtilities.VerifyStatusCodes;
import CommonUtilities.createURL;
import CommonUtilities.readProperties;
import CommonUtilities.readfilejsoncommon;
import Pojo_Classes.Postjsoncreation;
import io.restassured.response.Response;

public class TC1_Test2 {

	@Test
	public void Testcase() throws IOException {
		
		 final org.slf4j.Logger logger = LoggerFactory.getLogger(TC1_Test2.class);
		 logger.info("Test is started ");
		String resource=readProperties.readDatafromProperties("endpoint1");
		Postjsoncreation ps=new Postjsoncreation(1, "Test", "anothe value sample");
		ObjectMapper om=new ObjectMapper();
		String BaseURI= createURL.getBaseURI(resource);
		Response res=Base.postRequest(BaseURI,om.writeValueAsString(ps));
		VerifyStatusCodes.verifyStatusCode(res, 201);
		 logger.info("Test is completed Sucessfully ");
	}
}

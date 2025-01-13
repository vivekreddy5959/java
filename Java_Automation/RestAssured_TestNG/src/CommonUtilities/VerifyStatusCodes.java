package CommonUtilities;

import org.slf4j.LoggerFactory;
import org.testng.Assert;

import TestCases.TC1_Test2;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class VerifyStatusCodes {
	 final static org.slf4j.Logger logger = LoggerFactory.getLogger(TC1_Test2.class);
	
    public static void verifyStatusCode(Response response, int expectedStatusCode) {
        response.then().statusCode(expectedStatusCode);
        logger.info("Response Status Code: {}", response.getStatusCode());
        logger.info("Response Body: {}", response.getBody().asString());
    }
}

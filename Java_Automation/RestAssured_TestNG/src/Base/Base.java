package Base;

import io.restassured.RestAssured;
import io.restassured.config.EncoderConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Base {
	
	
	public static Response getRequest(String requestURI) {
		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.contentType("ContentType.JSON");
		Response resp=requestSpecification.get(requestURI);
		return resp;
		
	}
	public static Response postRequest(String requestURI, String payload) {
		RequestSpecification requestSpecification = RestAssured.given();
//		   requestSpecification.config(RestAssured.config().encoderConfig(EncoderConfig.encoderConfig()
//	                .encodeContentTypeAs("application/json", ContentType.JSON)));
		   
		   requestSpecification.config(RestAssured.config().encoderConfig(
				    EncoderConfig.encoderConfig().encodeContentTypeAs("application/json", ContentType.JSON)));
		   requestSpecification.contentType(ContentType.JSON);
		Response resp=requestSpecification.body(payload).post(requestURI);
		return resp;
	}
	public static Response putRequest(String requestURI, String payload) {
		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.contentType("ContentType.JSON");
		Response resp=requestSpecification.body(payload).put(requestURI);
		return resp;
	}
	public static Response deleteRequest(String requestURI, String payload) {
		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.contentType("ContentType.JSON");
		Response resp=requestSpecification.body(payload).delete(requestURI);
		return resp;
	}
	
	public static Response deleteRequest(String requestURI) {
		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.contentType("ContentType.JSON");
		Response resp=requestSpecification.delete(requestURI);
		return resp;
	}

}

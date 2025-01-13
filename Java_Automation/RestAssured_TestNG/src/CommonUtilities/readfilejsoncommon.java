package CommonUtilities;

import java.util.logging.Logger;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class readfilejsoncommon {
	
	public static String getThejsonValue(Response value, String key) throws Exception {
		try {
		String convertedtoStringvalue=value.asString();
		JsonPath jp=new JsonPath(convertedtoStringvalue);
		String AttributeValue=jp.getString(key);
		
		return AttributeValue;
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new Exception("Error with the data String value, Verify the logs for more details");
		}
	}

}

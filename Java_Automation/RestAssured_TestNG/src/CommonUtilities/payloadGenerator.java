package CommonUtilities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class payloadGenerator {
	
	public static String generateStringpayload(String filename) throws IOException {
		String filepath=System.getProperty("user.dir") + "/Resources/" +filename  ;
		return new String (Files.readAllBytes(Paths.get(filepath)));
			}
	
	
	
	

}

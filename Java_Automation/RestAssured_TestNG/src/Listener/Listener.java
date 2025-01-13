package Listener;
import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

	private static final Logger log = Logger.getLogger(Listener.class);


	  @Override
	    public void onTestStart(ITestResult result) {
		  System.out.println("Log4j configuration file location: " +
			        System.getProperty("log4j.configuration"));

	       log.info("Test Started");
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        // Capture test success information if needed
	    	
	    	log.info("Test Success" + result.getTestClass());
	        captureScreenshot("Test Passed");
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	        // Capture failure information like screenshots or logs
	    	log.info("Test Success" + result.getTestClass());
	        captureScreenshot("Test Failed");
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	    	log.info("Test Success" + result.getTestClass());
	        // Capture skipped test information if needed
	    }

	    @Override
	    public void onStart(ITestContext context) {
	    	
	        // Set up reports if needed
	    }

	    @Override
	    public void onFinish(ITestContext context) {
	        // Finish reports if needed
	    }

//	    @Attachment(value = "Screenshot", type = "image/png")
	    public byte[] captureScreenshot(String message) {
	        // Add logic to capture screenshots (or log details)
	        return new byte[0]; // Placeholder
	    }
}

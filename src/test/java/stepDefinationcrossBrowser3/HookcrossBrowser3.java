package stepDefinationcrossBrowser3;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import utilitycrossBrowser3.BaseClasscrossBrowser3;

public class HookcrossBrowser3 extends BaseClasscrossBrowser3 {
	
	
	@After
	
	public void tearDown(Scenario scenario) {
		
		
		TakesScreenshot tss = (TakesScreenshot) driver;
		byte[] screenshot = tss.getScreenshotAs(OutputType.BYTES);
		
		if (scenario.isFailed()) {
			
			scenario.attach(screenshot, "image/png","Screenshot captured for failed scenario");
		}else {
			
			scenario.attach(screenshot, "image/png","Screenshot captured for passed scenario");
			
		//}catch (Exception e) {
		   
			
	//	}finally {
		}
		
			scenario.log("Test completed");
		}
	}
	
	




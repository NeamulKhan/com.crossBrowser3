package utilitycrossBrowser3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClasscrossBrowser3 {
	
	public static Properties crossBrowser3_prop;
	public static WebDriver driver;
	 public static WebDriverWait wait;
	
			
	public  BaseClasscrossBrowser3 () {
				
	try {
		FileInputStream file = new FileInputStream (System.getProperty("user.dir")+"/src/test/resources/com/crossBrowser3/config/crossBrowser3.properties");
		
		crossBrowser3_prop = new Properties();
		crossBrowser3_prop.load(file);
		
	} catch (FileNotFoundException e) {
	    System.err.println("Properties file not found: " + e.getMessage());
	}
	  catch (IOException e) {
	    System.err.println("Error loading properties file: " + e.getMessage());
	}
	}
	
	public  static void crossBrowser3_setDriver() {
		
		String browser = crossBrowser3_prop.getProperty("Browser");
		
		if (browser.equalsIgnoreCase("chrome")) {
			
			System.out.println("Initializing Chrome browser...");
			 driver = new ChromeDriver();
		
		}else if (browser.equalsIgnoreCase("edge")) {
			
			System.out.println("Initializing Edge browser...");
			driver =new EdgeDriver();
		
		}else {
			throw new IllegalStateException ("Unsupported browser: "+ browser);
		}
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Initialize WebDriverWait here
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
			
		}

	public static void crossBrowser2_launchURL() {
	
		driver.get(crossBrowser3_prop .getProperty("base.url"));
}

}

package testRunnercrossBrowser3;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilitycrossBrowser3.BaseClasscrossBrowser3;

@CucumberOptions(features= {"src/test/resources/featureFoldercrossBrowser3"},
plugin={"json:target/cucumber.json"},
glue="stepDefinationcrossBrowser3", tags= "@Signup",

monochrome = true,
publish = true
		)

public class TestRunnercrossBrowser3 extends AbstractTestNGCucumberTests{
	
	@BeforeTest
	
	public void setUp() {
			
		BaseClasscrossBrowser3 test = new BaseClasscrossBrowser3();
		test.crossBrowser3_setDriver();
	}
	
	@AfterTest
	
	public void tearDown() {
		
		BaseClasscrossBrowser3.driver.quit();
		
	}

}

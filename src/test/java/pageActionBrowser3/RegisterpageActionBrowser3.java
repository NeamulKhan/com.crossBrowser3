package pageActionBrowser3;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageLocatorsBrowser3.RegisterPageLocatorBrowser3;
import utilitycrossBrowser3.BaseClasscrossBrowser3;

public class RegisterpageActionBrowser3 extends BaseClasscrossBrowser3{
	
	RegisterPageLocatorBrowser3  registerPageLocatorBrowser3 = new RegisterPageLocatorBrowser3();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	public void user_select_gender() {
	
	wait.until(ExpectedConditions.visibilityOf(registerPageLocatorBrowser3.gender)).click();
		
	}
	
	public void user_enter_firstName(String x) {
		
		wait.until(ExpectedConditions.visibilityOf(registerPageLocatorBrowser3.userFirstName)).sendKeys(x);
	}
	
	public void user_enter_lastName(String x) {
		
		wait.until(ExpectedConditions.visibilityOf(registerPageLocatorBrowser3.userLastName)).sendKeys(x);
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500");
	}
	
	public void user_enter_email(String x) {
		
		//((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500");
		
		wait.until(ExpectedConditions.visibilityOf(registerPageLocatorBrowser3.userEmail)).sendKeys(x);
	}

	public void user_select_date_Of_Birth(String x, String y, String z) {
		
		WebElement dayOption = wait.until(ExpectedConditions.visibilityOf(registerPageLocatorBrowser3.dateOfBirthDay));
		new Select(dayOption).selectByValue(x);
		
		WebElement monthOption = wait.until(ExpectedConditions.visibilityOf(registerPageLocatorBrowser3.monthOfBirthDay));
		new Select(monthOption).selectByVisibleText(y);
		
		WebElement yearOption = wait.until(ExpectedConditions.visibilityOf(registerPageLocatorBrowser3.yearOfBirthDay));
		new Select(yearOption).selectByValue(z);
				
	}
}

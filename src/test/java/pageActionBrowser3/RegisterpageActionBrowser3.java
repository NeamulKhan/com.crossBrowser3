package pageActionBrowser3;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.DataTable;
import pageLocatorsBrowser3.RegisterPageLocatorBrowser3;
import utilitycrossBrowser3.BaseClasscrossBrowser3;

public class RegisterpageActionBrowser3 extends BaseClasscrossBrowser3{
	
	RegisterPageLocatorBrowser3  registerPageLocatorBrowser3 = new RegisterPageLocatorBrowser3();
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	public void user_select_gender() {
	
	wait.until(ExpectedConditions.visibilityOf(registerPageLocatorBrowser3.gender)).click();
			
	}
	
	public void user_enter_the_following_details(DataTable dataTable) {
	    List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);

	    for (Map<String, String> row : data) {
	    	
	    	wait.until(ExpectedConditions.visibilityOf(registerPageLocatorBrowser3.userFirstName))
	            .sendKeys(row.get("FirstName"));
	        wait.until(ExpectedConditions.visibilityOf(registerPageLocatorBrowser3.userLastName))
	            .sendKeys(row.get("LastName"));
	        wait.until(ExpectedConditions.visibilityOf(registerPageLocatorBrowser3.userEmail))
	            .sendKeys(row.get("Email"));

	        // Selecting Date of Birth
	        Select selectDay = new Select(registerPageLocatorBrowser3.dateOfBirthDay);
	        selectDay.selectByVisibleText(row.get("Date_of_Birth"));

	        Select selectMonth = new Select(registerPageLocatorBrowser3.monthOfBirthDay);
	        selectMonth.selectByVisibleText(row.get("Month_of_Birth"));

	        Select selectYear = new Select(registerPageLocatorBrowser3.yearOfBirthDay);
	        selectYear.selectByVisibleText(row.get("Year_of_Birth"));

	        // Selecting Country
	        registerPageLocatorBrowser3.countryFlagContainer.click();
	        wait.until(ExpectedConditions.visibilityOf(registerPageLocatorBrowser3.selectCountry)).click();

	        // Entering Phone Number
	        wait.until(ExpectedConditions.visibilityOf(registerPageLocatorBrowser3.enterPhoneNumber))
	            .sendKeys(row.get("PhoneNumber"));

	        // Entering Password
	        wait.until(ExpectedConditions.visibilityOf(registerPageLocatorBrowser3.userPassword))
	            .sendKeys(row.get("Password"));

	        wait.until(ExpectedConditions.visibilityOf(registerPageLocatorBrowser3.enterConfirmPassword))
	            .sendKeys(row.get("Confirm_Password"));
	    }
	}
}








	/*
	public void user_enter_the_following_details(DataTable dataTable) {
		
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		
		for (Map<String, String> row : data) {
			
			wait.until(ExpectedConditions.visibilityOf(registerPageLocatorBrowser3.userFirstName)).sendKeys(row.get("FirstName"));
			wait.until(ExpectedConditions.visibilityOf(registerPageLocatorBrowser3.userLastName)).sendKeys(row.get("LastName"));
			wait.until(ExpectedConditions.visibilityOf(registerPageLocatorBrowser3.userEmail)).sendKeys(row.get("Email"));
			
		/*	wait.until(ExpectedConditions.visibilityOf(registerPageLocatorBrowser3.dateOfBirthDay)).sendKeys(row.get("Date_of_Birth"));
			wait.until(ExpectedConditions.visibilityOf(registerPageLocatorBrowser3.monthOfBirthDay)).sendKeys(row.get("Month_of_Birth"));
			wait.until(ExpectedConditions.visibilityOf(registerPageLocatorBrowser3.yearOfBirthDay)).sendKeys(row.get("Year_of_Birth"));
			wait.until(ExpectedConditions.visibilityOf(registerPageLocatorBrowser3.selectCountry)).sendKeys(row.get("Country"));
			wait.until(ExpectedConditions.visibilityOf(registerPageLocatorBrowser3.enterPhoneNumber)).sendKeys(row.get("PhoneNumber"));
			
			wait.until(ExpectedConditions.visibilityOf(registerPageLocatorBrowser3.userPassword)).sendKeys(row.get("Password"));
			wait.until(ExpectedConditions.visibilityOf(registerPageLocatorBrowser3.enterConfirmPassword)).sendKeys(row.get("Confirm_Password"));
			
			*/
			
	/*		
			
			 // Handle date of birth (assuming you have a method to select the date)
            selectDateOfBirth(row.get("Date_of_Birth"), row.get("Month_of_Birth"), row.get("Year_of_Birth"));

            // Handle country and phone number
            selectCountryAndEnterPhoneNumber(row.get("Country"), row.get("PhoneNumber"));

            wait.until(ExpectedConditions.visibilityOf(registerPageLocatorBrowser3.userPassword)).sendKeys(row.get("Password"));
            wait.until(ExpectedConditions.visibilityOf(registerPageLocatorBrowser3.userConfirmPassword)).sendKeys(row.get("Confirm_Password"));
			
			
			*/
	//	}
		
		
	//}
//	}
	/*
	public void user_enter_firstName(String x) {
			
		wait.until(ExpectedConditions.visibilityOf(registerPageLocatorBrowser3.userFirstName)).sendKeys(x);
	}
	
	public void user_enter_lastName(String x) {
		
		wait.until(ExpectedConditions.visibilityOf(registerPageLocatorBrowser3.userLastName)).sendKeys(x);
			
	}
	
	public void user_enter_email(String x) {
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500);");
		
		wait.until(ExpectedConditions.visibilityOf(registerPageLocatorBrowser3.userEmail)).sendKeys(x);
	}

	public void user_select_date_Of_Birth(String x, String y, String z) {
		
		WebElement dayOption = wait.until(ExpectedConditions.visibilityOf(registerPageLocatorBrowser3.dateOfBirthDay));
		new Select(dayOption).selectByValue(x);
		
		WebElement monthOption = wait.until(ExpectedConditions.visibilityOf(registerPageLocatorBrowser3.monthOfBirthDay));
		new Select(monthOption).selectByVisibleText(y);
		
		WebElement yearOption = wait.until(ExpectedConditions.visibilityOf(registerPageLocatorBrowser3.yearOfBirthDay));
		new Select(yearOption).selectByValue(z);
				
	}*/
	/*
	public void selectCountry_and_enterPhoneNumber(String y) throws InterruptedException {
		
		  // Click the flag dropdown to open country selection list
	    WebElement countryDropdown = wait.until(ExpectedConditions.elementToBeClickable(registerPageLocatorBrowser3.countryFlagContainer));
	    countryDropdown.click();
	    
	    // Wait for the dropdown list to load
	    Thread.sleep(2000);

	    // Locate the country dynamically based on its name
	   // String countryXPath = "//li[contains(@class, 'iti__country') and contains(text(), '" + x + "')]";
	    WebElement country = wait.until(ExpectedConditions.visibilityOf(registerPageLocatorBrowser3.selectCountry));
	    
	 // Scroll into view if needed
	    
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", country );
	    
	  //  JavascriptExecutor js = (JavascriptExecutor)driver;
	  //  js.executeScript("arguments[0].scrollIntoView(true);", countryOption);
	    Thread.sleep(1000);

	    // Click on the country
	    country.click();   
		
		  // Enter phone number after selecting the country
	    WebElement phoneField = wait.until(ExpectedConditions.visibilityOf(registerPageLocatorBrowser3.enterPhoneNumber));
	    phoneField.clear();  // Clear field before entering new data
	    phoneField.sendKeys(y);
		
		
	    
	}
	
	public void enterPassword_and_confirmPassword(String x, String y) {
		
		wait.until(ExpectedConditions.visibilityOf(registerPageLocatorBrowser3.userPassword)).sendKeys(x);
		wait.until(ExpectedConditions.visibilityOf(registerPageLocatorBrowser3.enterConfirmPassword)).sendKeys(y);
	}
	*/
	
//	public void clickPrivacy() {
		
	/*	try {
	        // Check if the cookie banner is present and close it
	        WebElement cookieBanner = driver.findElement(By.id("eu-cookie-bar-notification"));
	        if (cookieBanner.isDisplayed()) {
	            WebElement acceptCookies = driver.findElement(By.xpath("//button[contains(text(), 'Accept')]")); // Adjust XPath if needed
	            acceptCookies.click();
	            Thread.sleep(2000); // Wait for banner to disappear
	        }
	    } catch (NoSuchElementException | InterruptedException e) {
	        System.out.println("No cookie banner found or already closed.");
	    }
		*/

	    // Now click the checkbox for terms and conditions
	  //  WebElement privacyCheckbox = driver.findElement(By.xpath("(//label[@for='accept-consent'])[1]"));
	  //  ((JavascriptExecutor) driver).executeScript("arguments[0].click();", privacyCheckbox);
		
	//	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300);");
	/*	WebElement policyElement =	wait.until(ExpectedConditions.visibilityOf(registerPageLocatorBrowser3.acceptPrivacy));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", policyElement );
		policyElement.click();
		
	}
	
	public void clickRegisterButton() {
		
		wait.until(ExpectedConditions.visibilityOf(registerPageLocatorBrowser3.registerButton)).click();
	}
}*/
	

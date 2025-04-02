package pageActionBrowser3;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import pageLocatorsBrowser3.SignuppageLocatorsBrowser3;
import utilitycrossBrowser3.BaseClasscrossBrowser3;

public class SignuppageActionBrowser3 extends BaseClasscrossBrowser3{ 
	
	SignuppageLocatorsBrowser3 signuppageLocatorsBrowser3 = new SignuppageLocatorsBrowser3();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	public void select_gender_male () {
		
		wait.until(ExpectedConditions.visibilityOf(signuppageLocatorsBrowser3.gender)).click();
	}
	
	public void user_enter_the_following_details(DataTable dataTable) {
		
	    List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	    
	 //   System.out.println(data.get(0));
	    
	 // Debugging: Print the entire DataTable
	 //   System.out.println("DataTable received: " + data.toString());

	    for (Map<String, String> row : data) {
	        String fieldName = row.get("Field");
	        String fieldValue = row.get("Value");

	        switch (fieldName) {
	            case "FirstName":
	                wait.until(ExpectedConditions.visibilityOf(signuppageLocatorsBrowser3.userFirstName))
	                    .sendKeys(fieldValue);
	                break;
	            case "LastName":
	                wait.until(ExpectedConditions.visibilityOf(signuppageLocatorsBrowser3.userLastName))
	                    .sendKeys(fieldValue);
	                break;
	            case "Email":
	                wait.until(ExpectedConditions.visibilityOf(signuppageLocatorsBrowser3.userEmail))
	                    .sendKeys(fieldValue);
	                break;
	            case "Date_of_Birth":
	                Select selectDay = new Select(signuppageLocatorsBrowser3.dateOfBirthDay);
	                selectDay.selectByVisibleText(fieldValue);
	                break;
	            case "Month_of_Birth":
	                Select selectMonth = new Select(signuppageLocatorsBrowser3.monthOfBirthDay);
	                selectMonth.selectByVisibleText(fieldValue);
	                break;
	            case "Year_of_Birth":
	                Select selectYear = new Select(signuppageLocatorsBrowser3.yearOfBirthDay);
	                selectYear.selectByVisibleText(fieldValue);
	                break;
	            case "Country":
	            	
	            	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500);");
	                signuppageLocatorsBrowser3.countryFlagContainer.click();
	                wait.until(ExpectedConditions.visibilityOf(signuppageLocatorsBrowser3.selectCountry)).click();
	                break;
	            case "PhoneNumber":
	                wait.until(ExpectedConditions.visibilityOf(signuppageLocatorsBrowser3.enterPhoneNumber))
	                    .sendKeys(fieldValue);
	                break;
	            case "Password":
	                wait.until(ExpectedConditions.visibilityOf(signuppageLocatorsBrowser3.userPassword))
	                    .sendKeys(fieldValue);
	                break;
	            case "Confirm_Password":
	                wait.until(ExpectedConditions.visibilityOf(signuppageLocatorsBrowser3.enterConfirmPassword))
	                    .sendKeys(fieldValue);
	                break;
	            default:
	                System.out.println("Unknown field: " + fieldName);
	        }
	    }
	    
	   
	}
	
	public void user_check_to_the_terms_and_conditions() {
		
		wait.until(ExpectedConditions.visibilityOf(signuppageLocatorsBrowser3.acceptPrivacy)).click();
	}
	
	public void  user_clicks_on_the_signup_button() {
		
		wait.until(ExpectedConditions.visibilityOf(signuppageLocatorsBrowser3.registerButton)).click();
		
	}
	
	
	public void user_should_be_successfully_signedup() {
		
		WebElement welcomeMsgElement = wait.until(ExpectedConditions.visibilityOf(signuppageLocatorsBrowser3.welcomeMsg));	
		WebElement existMsgElement = wait.until(ExpectedConditions.visibilityOf(signuppageLocatorsBrowser3.existMsg));
		
		if (welcomeMsgElement.isDisplayed()) {
			
			 System.out.println("✅ User successfully registered!");
	            Assert.assertTrue(welcomeMsgElement.isDisplayed(),"User registration failed!");
	           
	        }else if (existMsgElement.isDisplayed()){
	        	
	        	System.out.println("⚠️ User already exists!");
	            Assert.assertTrue( existMsgElement.isDisplayed(),"User already exists message not displayed!");
		}
	}
	
/*	public void user_should_be_successfully_signedup(boolean isNewUser) {
		
		// Check if the user is new or already exists
		
		
		
		if (isNewUser) {
			
			//Verify if the user has been successfully signed up
			
			WebElement welcomeMsgElement = wait.until(ExpectedConditions.visibilityOf(signuppageLocatorsBrowser3.welcomeMsg));
			boolean userRegistered = welcomeMsgElement.isDisplayed();
			Assert.assertTrue(userRegistered);
			
		}else {
			// Verify if the user already exist
			WebElement existMsgElement = wait.until(ExpectedConditions.visibilityOf(signuppageLocatorsBrowser3.existMsg));
			boolean userExist = existMsgElement.isDisplayed();
			Assert.assertTrue(userExist);
		}
		
	}*/
}

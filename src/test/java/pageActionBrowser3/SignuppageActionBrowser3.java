package pageActionBrowser3;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	

}

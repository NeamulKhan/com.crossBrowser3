package pageLocatorsBrowser3;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilitycrossBrowser3.BaseClasscrossBrowser3;

public class SignuppageLocatorsBrowser3 extends BaseClasscrossBrowser3{
	
	
	public SignuppageLocatorsBrowser3() {
		
		PageFactory.initElements(driver,this);	
	}
	
	@FindBy(xpath="(//div[@for='gender-male'])[1]")
	public WebElement gender;
	
	@FindBy(id="FirstName")
	public WebElement userFirstName;
	
	@FindBy(id="LastName")
	public WebElement userLastName;
	
	@FindBy(id="Email")
	public WebElement userEmail;
	
	@FindBy(xpath="(//select[@name='DateOfBirthDay'])[1]")
	public WebElement dateOfBirthDay;
	
	@FindBy(xpath="(//select[@name='DateOfBirthMonth'])[1]")
	public WebElement monthOfBirthDay;
	
	@FindBy(xpath="(//select[@name='DateOfBirthYear'])[1]")
	public WebElement yearOfBirthDay;
	
	@FindBy(xpath="//div[@class='iti__selected-flag']")
	//@FindBy(xpath="//*[@id=\"register-page\"]/body/div[6]/section/div/div/div/div[3]/div/div/div[2]/div/div/form/div[2]/div/div/div/div/div[2]/div/div")
	public WebElement countryFlagContainer;
	
	@FindBy(xpath="//li[contains(@class, 'iti__country') and contains(., 'Canada')]")
	public WebElement selectCountry;
	
	@FindBy (xpath="(//input[@id='Phone'])[1]")
	public WebElement enterPhoneNumber;
	
	@FindBy (id="Password")
	public WebElement userPassword;
	
	@FindBy (id="ConfirmPassword")
	public WebElement enterConfirmPassword;
	
	@FindBy (xpath="(//label[@for='accept-consent'])[1]")
	public WebElement acceptPrivacy;
	
	@FindBy (id ="register-button")
	public WebElement registerButton;
	
	@FindBy(xpath="(//div[@class='register-result-subtitle'])[1]")
	public WebElement welcomeMsg;
	
	@FindBy(xpath="(//li[normalize-space()='Current customer is already registered'])[1]")
	public WebElement existMsg;
	
}




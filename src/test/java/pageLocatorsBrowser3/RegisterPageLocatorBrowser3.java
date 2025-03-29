package pageLocatorsBrowser3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilitycrossBrowser3.BaseClasscrossBrowser3;

public class RegisterPageLocatorBrowser3 extends BaseClasscrossBrowser3{
	
		public RegisterPageLocatorBrowser3 () {
		
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
	
	
}

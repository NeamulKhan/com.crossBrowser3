package stepDefinationcrossBrowser3;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageActionBrowser3.HomePageActionBrowser3;
import pageActionBrowser3.RegisterpageActionBrowser3;
import pageLocatorsBrowser3.RegisterPageLocatorBrowser3;
import utilitycrossBrowser3.BaseClasscrossBrowser3;

public class Register1crossBrowser3  extends BaseClasscrossBrowser3{
	
	HomePageActionBrowser3 homePageActionBrowser3 = new HomePageActionBrowser3();
	RegisterpageActionBrowser3 registerpageActionBrowser3 = new RegisterpageActionBrowser3();

@Given("User is on the registration page")
public void user_is_on_the_registration_page() {
    
	driver.get("https://www.alwaysfashion.com/en/register");
}

@When("User select gender")
public void user_select_gender() {
   
	registerpageActionBrowser3.user_select_gender();
}


@When("User enters the following details:")

public void user_enters_the_following_details(DataTable dataTable) {
	
	registerpageActionBrowser3.user_enter_the_following_details(dataTable);
	
}
	@When("User agrees to the terms and conditions")
	public void user_agrees_to_the_terms_and_conditions() {
	    
		
	}

	@When("User clicks on the Register button")
	public void user_clicks_on_the_register_button() {
	  
		
	}

	@Then("User should be successfully registered")
	public void user_should_be_successfully_registered() {
	   
		
	}

	@Then("User should see a successful registration message")
	public void user_should_see_a_successful_registration_message() {
	  
		
	}




}

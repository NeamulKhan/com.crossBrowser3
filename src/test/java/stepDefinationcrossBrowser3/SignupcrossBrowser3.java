package stepDefinationcrossBrowser3;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageActionBrowser3.SignuppageActionBrowser3;
import pageLocatorsBrowser3.SignuppageLocatorsBrowser3;
import utilitycrossBrowser3.BaseClasscrossBrowser3;

public class SignupcrossBrowser3 extends BaseClasscrossBrowser3{
	
	SignuppageActionBrowser3 signuppageActionBrowser3 = new SignuppageActionBrowser3();
	SignuppageLocatorsBrowser3 signuppageLocatorsBrowser3 = new SignuppageLocatorsBrowser3();
	
	@Given("User is on the signup page")
	public void user_is_on_the_signup_page() {
	  
		driver.get("https://www.alwaysfashion.com/en/register");
	}

	@When("User select gender male")
	public void user_select_gender_male() {
	  
		signuppageActionBrowser3.select_gender_male();
	}

	@When("User enters the following details in signup feilds:")
	public void user_enters_the_following_details_in_signup_feilds(DataTable dataTable) {
	  
		signuppageActionBrowser3.user_enter_the_following_details(dataTable);
			
	}
	
	@When("User check to the terms and conditions")
	public void user_check_to_the_terms_and_conditions() {
	    
		signuppageActionBrowser3.user_check_to_the_terms_and_conditions();
	}
	
	@When("User clicks on the signup button")
	public void user_clicks_on_the_signup_button() {
	   
		signuppageActionBrowser3.user_clicks_on_the_signup_button();
	}

	@Then("User should be successfully signedup")
	public void user_should_be_successfully_signedup() {
	  
	//	signuppageActionBrowser3.user_should_be_successfully_signedup(false);
		
		signuppageActionBrowser3.user_should_be_successfully_signedup();
	}
	
	}

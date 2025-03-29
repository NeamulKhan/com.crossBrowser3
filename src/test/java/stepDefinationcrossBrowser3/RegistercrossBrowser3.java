package stepDefinationcrossBrowser3;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageActionBrowser3.HomePageActionBrowser3;
import pageActionBrowser3.RegisterpageActionBrowser3;
import utilitycrossBrowser3.BaseClasscrossBrowser3;

public class RegistercrossBrowser3 extends BaseClasscrossBrowser3 {
	
	HomePageActionBrowser3 homePageActionBrowser3 = new HomePageActionBrowser3();
	RegisterpageActionBrowser3 registerpageActionBrowser3 = new RegisterpageActionBrowser3();
	
	
@Given("User launches the Always Fashion website")
public void user_launches_the_always_fashion_website() {
   
	crossBrowser2_launchURL();
}

@Then("verify website homepage load successfully")
public void verify_website_homepage_load_successfully() {
	
   	homePageActionBrowser3.verify_website_homepage_load_successfully();
	
}

@When("User clicks on the user icon and clicks the Registration link")
public void user_clicks_on_the_user_icon_and_clicks_the_registration_link() {
    
	homePageActionBrowser3.user_clicks_on_the_user_icon_and_the_Registration_link();
}

@Then("User should be navigated to the Registration page")
public void user_should_be_navigated_to_the_registration_page() {
   
	homePageActionBrowser3.user_should_be_navigated_to_the_registration_page();
}

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
   
	List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	
	for (Map<String, String> row : data) {
		
		registerpageActionBrowser3.user_enter_firstName(crossBrowser3_prop.getProperty("first.name"));
		registerpageActionBrowser3.user_enter_lastName(crossBrowser3_prop.getProperty("last.name"));
		registerpageActionBrowser3.user_enter_email(crossBrowser3_prop.getProperty("email"));
		
	}
}

@When("User agrees to the terms and conditions")
public void user_agrees_to_the_terms_and_conditions() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
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

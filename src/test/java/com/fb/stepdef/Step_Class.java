package com.fb.stepdef;

import org.openqa.selenium.WebDriver;

import com.fb.runner.Runner_Class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Class {

	
	public static WebDriver driver= Runner_Class.driver;
	
	
@Given("user can able to launch the url")
public void user_can_able_to_launch_the_url() {
	driver.get("https://www.facebook.com/");
   
}

@When("user can able to enter the username in the username field")
public void user_can_able_to_enter_the_username_in_the_username_field() {
    
}

@When("user canm able to enter the password in the text box")
public void user_canm_able_to_enter_the_password_in_the_text_box() {
    
}

@Then("user can able to click the login button and its navigate to next page")
public void user_can_able_to_click_the_login_button_and_its_navigate_to_next_page() {
    
}


}

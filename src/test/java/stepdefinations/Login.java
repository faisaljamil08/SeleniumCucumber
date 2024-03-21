package stepdefinations;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver driver;
	
	
	@Given("User has navigated to login page")
	public void User_has_navigated_to_login_page() {
		
		driver = DriverFactory.getDriver();
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
		
	}
	
	@When("User enters valid email address{string} into email field")
	public void User_enters_valid_email_address_into_email_field(String emailText) {
		
		driver.findElement(By.id("input-email")).sendKeys(emailText);
}

	@And("User has entered valid password {string} into password field")
	public void user_has_entered_valid_password_into_password_field(String passwordText) {
		
		driver.findElement(By.id("input-password")).sendKeys(passwordText);
	    
	}

	@And("User clicks on Login button")
	public void user_clicks_on_login_button() {
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	    
	}

	@Then("User should get successfully logged in")
	public void user_should_get_successfully_logged_in() {
	   
			 
	}

	@When("User enters invalid email address {string} into email field")
	public void user_enters_invalid_email_address_into_email_field(String invalidEmailText) {
	 
		driver.findElement(By.id("input-email")).sendKeys(invalidEmailText);
	}

	@When("User enters invalid password {string} into password field")
	public void user_enters_invalid_password_into_password_field(String invalidPasswordText) {
	    
		driver.findElement(By.id("input-password")).sendKeys(invalidPasswordText);
	}

	@Then("User should get a proper warning message about credentails mismatch")
	public void user_should_get_a_proper_warning_message_about_credentails_mismatch() {
	    		
	}

	@Given("User has navigated to Login page")
	public void user_has_navigated_to_login_page() {
	    
	}

	@When("User enters valid password {string} into password field")
	public void user_enters_valid_password_into_password_field(String string) {
	    
	}

	@When("User dont enter email address into email field")
	public void user_dont_enter_email_address_into_email_field() {
	   
	}

	@When("User dont enter password into password field")
	public void user_dont_enter_password_into_password_field() {
	    
	}


}
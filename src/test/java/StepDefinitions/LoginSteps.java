package StepDefinitions;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BasePage{
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		openBrowser("chrome");
		enterUrl("https://www.facebook.com/");
		System.out.println("Inside Step- user is on login Page");
	    
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		driver.findElement(By.id("email")).sendKeys("jai balayya");
		driver.findElement(By.id("pass")).sendKeys("NBK");
		System.out.println("Inside Step-user enters username and password ");
	    
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		driver.findElement(By.name("login")).click();
		System.out.println("Inside Step- clicks on login button");
	    
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		driver.close();
		System.out.println("Inside Step- user is navigated to the home page");
	   
	}


}

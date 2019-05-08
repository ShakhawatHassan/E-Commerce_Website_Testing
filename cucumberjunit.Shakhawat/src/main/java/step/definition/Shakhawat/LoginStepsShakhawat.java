package step.definition.Shakhawat;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepsShakhawat {

	WebDriver driver;
	@Given("^User is on UPS login page$")
	public void user_is_on_UPS_login_page() throws Throwable {
	 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver = new chromedriver();
	driver.get("https://www.ups.com/lasso/login?loc=en_US&returnto=https%3A%2F%2Fwww%2Egoogle%2Ecom%2F")
	driver.get
	}
	@When("^User entered invalid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_entered_invalid_and(String arg1, String arg2) throws Throwable {

	}

	@Then("^User should not be able to login$")
	public void user_should_not_be_able_to_login() throws Throwable {
	  
	}
	
}

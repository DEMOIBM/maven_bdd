package Step_Definition;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Step_Definition {
	WebDriver ffdriver;
	@Given("^Login application should be available$")
	public void login_application_should_be_available()  {
		
			ffdriver = new FirefoxDriver();
		    ffdriver.get("http://opensource-demo.ornagehrmlive.com");
		      
	}

	@When("^Validate Login application$")
	public void validate_Login_application()  {
		String title = ffdriver.getTitle();
		   System.out.println(title);
	    
	}

	@Then("^Login should be successful$")
	public void login_should_be_successful() {
	}
	



}

package stepDefinitions;

import static org.junit.Assert.assertEquals;



import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LandingPage;

public class LandingPageVarification extends Base {
	// WebDriver driver;
	LandingPage landingPage = new LandingPage(driver);

	@Given("I am In Chrome Browser")
	public void i_am_In_Chrome_Browser() {
		String className = driver.getClass().toString(); // class org.openqa.selenium.chrome.ChromeDriver
		className = className.substring(className.lastIndexOf(".") + 1);
		assertEquals("ChromeDriver", className);
	}

	@When("I Navigate landing page url")
	public void i_Navigate_landing_page_url() {
		landingPage.navigateURL();
	}

	@Then("The landing Page appear")
	public void the_landing_Page_appear() {
		assertEquals("Welcome to MicroTech NA.", landingPage.welcomeText());
	}

}

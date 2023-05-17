package stepDefinitions;

import static org.junit.Assert.assertEquals;



import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CustomerLoginVerification_And_HomePage;
import pages.LandingPage;


public class CustomerLogin_And_HomePageverification extends Base{
	
	
	CustomerLoginVerification_And_HomePage customerLoginPage = new CustomerLoginVerification_And_HomePage(driver);
	LandingPage landingPage = new LandingPage(driver);
	
	@Given("I am in Landing Page")
	public void i_am_in_Landing_Page() {
		landingPage.navigateURL();
	}

	@When("I Click on Login")
	public void i_Click_on_Login() {
		customerLoginPage.click_Login();
	}

	@When("Click Customer Login")
	public void click_Customer_Login() {
		customerLoginPage.click_Customer_Login();
	}

	@Then("I enter User Id {string}")
	public void i_enter_User_Id(String string)   {
		customerLoginPage.enterUserId("david@gmail.com");
		
	}

//	@Then("I enter Password {string}")
//	public void i_enter_Password(String string) {
//		customerLoginPage.enterUserPassword("1234");
//	}
	
	@Then("I enter Password {string}")
	public void i_enter_password(String string)   {
		customerLoginPage.enteruserpassword("1234");
		
	}



	@When("I click Login button")
	public void i_click_Login_button() {
		customerLoginPage.clickLoginBtn();
	}

	@Then("I will see {string}")
	public void i_will_see(String string) {
		assertEquals("Welcome David", customerLoginPage.getWelcomeText()); 
	}


}

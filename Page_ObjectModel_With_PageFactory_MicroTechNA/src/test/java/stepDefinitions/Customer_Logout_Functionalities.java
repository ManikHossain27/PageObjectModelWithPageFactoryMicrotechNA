package stepDefinitions;

import static org.junit.Assert.assertEquals;

import base.Base;
import io.cucumber.java.en.Then;
import pages.Customer_logout_Functionalities_Page;

public class Customer_Logout_Functionalities extends Base{
	Customer_logout_Functionalities_Page custLogOut = new Customer_logout_Functionalities_Page(driver);
	
	@Then("I Click Logout button")
	public void i_Click_Logout_button() {
		custLogOut.click_Logout();
	}

	@Then("I See Customer Login Page")
	public void i_See_Customer_Login_Page() {
		assertEquals("Customer Login",custLogOut.CustHomePageLevel()); 
	}
}

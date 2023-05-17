package stepDefinitions;

import static org.junit.Assert.assertEquals;

import base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Employee_Invalid_Password_Verification_Page;

public class Employee_Invalid_password_Verification extends Base{

	Employee_Invalid_Password_Verification_Page invaliedPass =  new Employee_Invalid_Password_Verification_Page(driver);
	
	@Then("I Will Enter password {string}")
	public void i_Will_Enter_password(String string) {
		invaliedPass.Enter_Pass("1245");
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
		invaliedPass.Click_Login();
	}

	@Then("I see {string}")
	public void i_see(String string) {
		System.out.println("complete********** = " + invaliedPass.Check_Invalid_Pass());
	   assertEquals("Invalid username or password!", invaliedPass.Check_Invalid_Pass());
	}
}

package stepDefinitions;

import static org.junit.Assert.assertEquals;

import base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Employee_login_functionalities_Page;

public class Employee_login_functionalities extends Base{
	
	Employee_login_functionalities_Page empLogin = new Employee_login_functionalities_Page(driver);
	@When("I Will see Employee Login Page")
	public void i_Will_see_Employee_Login_Page() {
		assertEquals("Employee Login", empLogin.Emp_Login_Page());
	}

	@Then("I Enter user id {string}")
	public void i_Enter_user_id(String string)  {
		empLogin.enter_User_Id("testpilot@gmail.com");
	}

	@Then("I Enter password {string}")
	public void i_Enter_password(String string) {
		empLogin.enter_User_pass("1234");
	}

	@When("I click login button")
	public void i_click_login_button() {
		empLogin.click_Emp_Login_Btn();
	}

	@Then("I Will see {string}")
	public void i_Will_see(String string) throws InterruptedException {
		Thread.sleep(2000);
	  assertEquals("Welcome Test", empLogin.Emp_Home_Page());
	}

}

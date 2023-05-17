package stepDefinitions;

import static org.junit.Assert.assertEquals;

import base.Base;
import io.cucumber.java.en.Then;
import pages.Employee_logout_Functionalities_Page;

public class Employee_logou_Functionalities extends Base{
	
	Employee_logout_Functionalities_Page emplogoutpage = new Employee_logout_Functionalities_Page(driver);
	
	@Then("I Click Employee Logout button")
	public void i_Click_Employee_Logout_button() {
		emplogoutpage.click_Emp_Logout_Btn();
	}

	@Then("I Will See Employee Login Page")
	public void i_Will_See_Employee_Login_Page() {
	   System.out.println("Visible "+emplogoutpage.Emp_Login_Page()+" Page");
		assertEquals("Employee Login", emplogoutpage.Emp_Login_Page());
	}

}

package stepDefinitions;

import static org.junit.Assert.assertEquals;


import base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AdminEmployeeLeavePage;
import pages.AdminHomePage;
import pages.AdminLoginPage;

public class AdminLoginAndAlertMassageHandleFunctionalities extends Base{
	AdminLoginPage adminLogin = new AdminLoginPage(driver);
	AdminHomePage adminHomePage = new AdminHomePage(driver);
	AdminEmployeeLeavePage adminemployeeLeavePage = new AdminEmployeeLeavePage(driver);
	
	@When("Click Admin Login")
	public void click_Admin_Login() {
		adminLogin.click_AdminLoginBtn();
		
	}

	@Then("I enters User Id {string}")
	public void i_enters_User_Id(String string) {
		adminLogin.enter_User_Email("admin@gmail.com");
	}

	@Then("I enters Password {string}")
	public void i_enters_Password(String string) {
		adminLogin.enter_User_pass("admin");
	}

	@When("I will click Login button")
	public void i_will_click_Login_button() {
		adminLogin.click_Admin_Login_Btn();
	}

	@Then("I will seenn {string}")
	public void i_will_seenn(String string) {
		assertEquals("Employee Leaderboard", adminHomePage.Admin_Home_Page_Level());
	}

	@Then("I click Employee Button")
	public void i_click_Employee_Button() {
		adminHomePage.click_Emp_Btn();
	}

	@Then("I clcik Employee Leave Button")
	public void i_clcik_Employee_Leave_Button() {
		adminemployeeLeavePage.click_Emp_Leave_Btn();
	}

	@Then("I click reason of leave for exam approve button")
	public void i_click_reason_of_leave_for_exam_approve_button() {
		adminemployeeLeavePage.click_Approve_Btn();
	}

	@Then("I click alert message OK")
	public void i_click_alert_message_OK() throws InterruptedException {
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
	}

	@Then("refresh URL")
	public void refresh_URL() throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().refresh();
		
	}

	@Then("I will see the status of {string}")
	public void i_will_see_the_status_of(String string) {
		assertEquals("Approved", adminemployeeLeavePage.Admin_Approve_Level()); 
	}

}

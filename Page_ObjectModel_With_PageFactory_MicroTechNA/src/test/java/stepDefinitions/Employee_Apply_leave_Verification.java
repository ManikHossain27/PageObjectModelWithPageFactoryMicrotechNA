package stepDefinitions;

import static org.junit.Assert.assertEquals;

import base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Employee_Apply_leave_Verification_Page;

public class Employee_Apply_leave_Verification extends Base{
	
	Employee_Apply_leave_Verification_Page applyLeave = new Employee_Apply_leave_Verification_Page(driver);
	
	@When("I Click Apply leave button")
	public void i_Click_Apply_leave_button() {
		applyLeave.click_applyLeaveButton();
	}

	@Then("I See employee leave Page")
	public void i_See_employee_leave_Page() {
		System.out.println("confirm "+applyLeave.ApplyLeavelevelCheck());
		assertEquals("Apply Leave Form", applyLeave.ApplyLeavelevelCheck());
		System.out.println("confirm "+applyLeave.applyLeaveReasonBtn("placeholder"));
		assertEquals("Reason", applyLeave.applyLeaveReasonBtn("placeholder"));
		System.out.println("confirm "+applyLeave.StartDateCheck());
		assertEquals("Start Date", applyLeave.StartDateCheck());
		System.out.println("confirm "+applyLeave.EndDateCheck());
		assertEquals("End Date", applyLeave.EndDateCheck());
		System.out.println("confirm "+applyLeave.SubmitButtonCheck());
		assertEquals("Submit", applyLeave.SubmitButtonCheck());
		
	}
	@Then("I write reason for apply leave")
	public void i_write_reason_for_apply_leave() {
		applyLeave.applyLeaveReason("Urgent Family Cause");
	}

	@Then("I Enter Start Date")
	public void i_Enter_Start_Date() {
		applyLeave.StartDate("2022-04-22");
	}

	@Then("I Enter End Date")
	public void i_Enter_End_Date() {
		applyLeave.EndDate("2022-04-25");
	}

	@Then("I will click submit button")
	public void i_will_click_submit_button() throws InterruptedException {
		applyLeave.click_Submit_Button();
		Thread.sleep(2000);
	}
	@Then("I will refresh Url")
	public void i_will_refresh_Url() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(2000);

	}
	@Then("I will see Apply leave reason and Status")
	public void i_will_see_Apply_leave_reason_and_Status() {
	    
	}

}

package stepDefinitions;

import static org.junit.Assert.assertEquals;

import base.Base;
import io.cucumber.java.en.Then;
import pages.Employee_profile_update_Verification_Page;

public class Employee_profile_update_Verification extends Base{
	
	Employee_profile_update_Verification_Page profileUpdatePage = new Employee_profile_update_Verification_Page(driver);
	
	@Then("I will click update info button")
	public void i_will_click_update_info_button() {
		profileUpdatePage.click_UpdateInfoButton();
	}

	@Then("I see {string} Employee Page")
	public void i_see_Employee_Page(String string) {
		assertEquals("Update Employee Info", profileUpdatePage.UpdateInfolevelCheck());
	}

	@Then("I Will update contact")
	public void i_Will_update_contact() throws InterruptedException {
		profileUpdatePage.UpdateContact();
		Thread.sleep(2000);
		profileUpdatePage.Update_Contact("01234567890");
	}

	@Then("I Will update address")
	public void i_Will_update_address() throws InterruptedException {
		profileUpdatePage.UpdateAddress();
		Thread.sleep(2000);
		profileUpdatePage.Update_Address("Dhaka, Bangladesh");
	}

	@Then("I Will click submit button")
	public void i_Will_click_submit_button() {
		profileUpdatePage.click_SumitButton();
	}

	@Then("I click refresh url")
	public void i_click_refresh_url() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(3000);
	}

	@Then("I will see Employee updated contact")
	public void i_will_see_Employee_updated_contact() throws InterruptedException {
		System.out.println("updated value "+profileUpdatePage.UpdatedContact("value"));
		Thread.sleep(2000);
		assertEquals("01234567890", profileUpdatePage.UpdatedContact("value"));
	}

	@Then("I will see Employee updated address")
	public void i_will_see_Employee_updated_address() throws InterruptedException {
		System.out.println("updated value "+profileUpdatePage.UpdatedAddress("value"));
		Thread.sleep(2000);
		assertEquals("Dhaka, Bangladesh", profileUpdatePage.UpdatedAddress("value"));
	}


}

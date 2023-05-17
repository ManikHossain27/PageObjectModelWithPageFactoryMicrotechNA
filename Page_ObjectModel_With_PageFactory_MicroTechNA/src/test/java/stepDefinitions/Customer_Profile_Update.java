package stepDefinitions;

import static org.junit.Assert.assertEquals;


import base.Base;
import io.cucumber.java.en.Then;
import pages.CustomerProfileUpdatePage;

public class Customer_Profile_Update extends Base {
	
	CustomerProfileUpdatePage custUpdateInfo = new CustomerProfileUpdatePage(driver);
	
	@Then("I will click update info")
	public void i_will_click_update_info() {
		custUpdateInfo.click_Update_Info();
	}

	@Then("I see {string} page")
	public void i_see_page(String string) {
		assertEquals("Update Customer Info",custUpdateInfo.fname()); 
	}

	@Then("I update contact")
	public void i_update_contact() throws InterruptedException {
		custUpdateInfo.UpdateContact();
		Thread.sleep(2000);
		custUpdateInfo.cname("0123456789");
		Thread.sleep(2000);
	}

	@Then("I update address")
	public void i_update_address() throws InterruptedException {
		custUpdateInfo.UpdateAddress();
		Thread.sleep(2000);
		custUpdateInfo.aname("123 test road,TX");
		Thread.sleep(2000);
	}

	@Then("I click submit button")
	public void i_click_submit_button() {
		custUpdateInfo.submitbtn();
	}

	@Then("I will click refresh url")
	public void i_will_click_refresh_url() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(3000);
	}

	@Then("I will see updated contact")
	public void i_will_see_updated_contact() throws InterruptedException {	
		System.out.println("updated value "+custUpdateInfo.UpdatedCont("value"));
		Thread.sleep(2000);
		assertEquals("0123456789", custUpdateInfo.UpdatedCont("value"));
	}

	@Then("I will see updated address")
	public void i_will_see_updated_address() throws InterruptedException { 
		System.out.println("updated value "+custUpdateInfo.UpdatedAddress("value"));
		Thread.sleep(2000);
		assertEquals("123 test road,TX", custUpdateInfo.UpdatedAddress("value"));
	}

}

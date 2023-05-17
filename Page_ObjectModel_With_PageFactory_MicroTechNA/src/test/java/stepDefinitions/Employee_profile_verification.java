package stepDefinitions;

import static org.junit.Assert.assertEquals;

import base.Base;
import io.cucumber.java.en.Then;
import pages.Employee_profile_verification_Page;

public class Employee_profile_verification extends Base{

	Employee_profile_verification_Page profilePage =  new Employee_profile_verification_Page(driver);
	
	@Then("I click My Profile button")
	public void i_click_My_Profile_button() {
		profilePage.click_myProfile();
	}
	
	@Then("I will seen {string} My Info Page")
	public void i_will_see_My_Info_Page() {
		assertEquals("My Info",profilePage.My_Info_LevelCheck()); 
	}

	
}

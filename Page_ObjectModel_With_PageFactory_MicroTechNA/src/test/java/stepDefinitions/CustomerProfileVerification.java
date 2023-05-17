package stepDefinitions;

import static org.junit.Assert.assertEquals;

import base.Base;
import io.cucumber.java.en.Then;
import pages.CustomerProfileVerificationPage;


public class CustomerProfileVerification extends Base{
	CustomerProfileVerificationPage custProfile = new CustomerProfileVerificationPage(driver);
	
	@Then("I will click My Profile")
	public void i_will_click_My_Profile() {
		custProfile.click_MyProfile();
	}
	
	@Then("I will seen {string}")
	public void i_will_see(String string) {
	   assertEquals("My Info",custProfile.get_MyInfo()); 
	}
	
	@Then("I will see My First & Last name")
	public void i_will_see_My_First_Last_name() {
		 assertEquals("First Name",custProfile.fname()); 
		 assertEquals("Last Name",custProfile.lname()); 
		
	}

	@Then("I will see Email Address")
	public void i_will_see_Email_Address() {
		assertEquals("Email",custProfile.ename()); 
	}

	@Then("I will see Date of Birth & Gender")
	public void i_will_see_Date_of_Birth_Gender() {
		assertEquals("Date of Birth",custProfile.bname());
		assertEquals("Gender",custProfile.gname()); 
		
	}

	@Then("I will see contact number")
	public void i_will_see_contact_number() {
		assertEquals("Contact Number",custProfile.cname()); 
	}

	@Then("I will see Address")
	public void i_will_see_Address() {
		assertEquals("Address",custProfile.aname()); 
	}
}

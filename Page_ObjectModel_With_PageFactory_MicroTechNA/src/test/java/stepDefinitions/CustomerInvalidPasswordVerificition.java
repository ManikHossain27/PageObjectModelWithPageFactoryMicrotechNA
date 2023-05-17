package stepDefinitions;

import static org.junit.Assert.assertEquals;

import base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Check_Customer_Invalied_Passward_Page;

public class CustomerInvalidPasswordVerificition extends Base{
	Check_Customer_Invalied_Passward_Page invalidpass = new Check_Customer_Invalied_Passward_Page(driver);

	@Then("I enter emailid {string}")
	public void i_enter_emailid(String string) {
		invalidpass.enteremailId("david@gmail.com");
	}

	@Then("I enter Passwordd {string}")
	public void i_enter_Password(String string) {
		invalidpass.enterUserpass("1245");
	}

	@When("I click loginn button")
	public void i_click_loginn_button() {
		invalidpass.clickLoginBtn();
	}

	@Then("I will check {string}")
	public void i_will_check(String string) {
		invalidpass.InValiedPasswardCheck();
		System.out.println("complete********** = " + invalidpass.InValiedPasswardCheck());
		assertEquals("Invalid username or password!", invalidpass.InValiedPasswardCheck());

	}

}

package stepDefinitions;

import static org.junit.Assert.assertEquals;

import base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Employee_product_order_page_verification_Page;

public class Employee_product_order_page_verification extends Base {

	Employee_product_order_page_verification_Page prodOrderPage = new Employee_product_order_page_verification_Page(driver);
	
	@When("I click Order Product button")
	public void i_click_order_List_button() {
		prodOrderPage.Click_OrderProduct();
	}

	@Then("I see order product page")
	public void i_see_order_product_page() {
		System.out.println("confirm "+prodOrderPage.Check_orderProdLevel());
	   assertEquals("Order Product", prodOrderPage.Check_orderProdLevel());
	   System.out.println("Visible "+prodOrderPage.Check_empIdLevel());
	   assertEquals("Employee ID", prodOrderPage.Check_empIdLevel());
	  // assertEquals("Choose Product Name", prodOrderPage.Check_ChoceProdName("selected"));
	   System.out.println("Visible "+prodOrderPage.Check_date("placeholder"));
	   assertEquals("Type order date", prodOrderPage.Check_date("placeholder"));
	   System.out.println("Visible "+prodOrderPage.Check_orderProdBtn());
	   assertEquals("Order Product", prodOrderPage.Check_orderProdBtn());
	   
	}
}

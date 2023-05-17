package stepDefinitions;

import static org.junit.Assert.assertEquals;

import base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Customer_Order_List_Page;

public class CustomerOrderListFunctionalities extends Base{
Customer_Order_List_Page  custOrderList = new Customer_Order_List_Page(driver);
	
	@When("I click order list button")
	public void i_click_order_list_button() {
		custOrderList.click_orderList();
		
	}

	@Then("I see oder list page")
	public void i_see_oder_list_page() {
		assertEquals("Order List", custOrderList.OrderListLevel()); 
	}
}

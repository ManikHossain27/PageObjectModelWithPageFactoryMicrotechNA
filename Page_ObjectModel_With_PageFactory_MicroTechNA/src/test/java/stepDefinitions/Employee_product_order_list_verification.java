package stepDefinitions;

import static org.junit.Assert.assertEquals;

import base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Employee_product_order_list_verification_Page;

public class Employee_product_order_list_verification extends Base{
	Employee_product_order_list_verification_Page orderList = new Employee_product_order_list_verification_Page(driver);
	
	@When("I click order List button")
	public void i_click_order_List_button() {
		orderList.Click_OrderList();
	}

	@Then("I Will see order product list page")
	public void i_Will_see_order_product_list_page() {
		System.out.println("Confirm "+ orderList.Check_orderId() );
	    assertEquals("Order ID", orderList.Check_orderId());
	    System.out.println("Confirm "+ orderList.Check_EmpId() );
	    assertEquals("Employee ID", orderList.Check_EmpId());
	    System.out.println("Confirm "+ orderList.Check_DeliveryDate() );
	    assertEquals("Delivery Date", orderList.Check_DeliveryDate());
	    System.out.println("Confirm "+ orderList.Check_ProductId() );
	    assertEquals("Product ID", orderList.Check_ProductId());
	    System.out.println("Confirm "+ orderList.Check_OrderDate() );
	    assertEquals("Order Date", orderList.Check_OrderDate());
	    
	}
}

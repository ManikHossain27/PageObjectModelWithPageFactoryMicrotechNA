package stepDefinitions;

import static org.junit.Assert.assertEquals;

import base.Base;
import io.cucumber.java.en.Then;
import pages.Customer_Order_List_Page;
import pages.Customer_Order_Product_Page;


public class Customer_Order_Product_and_Confirm_Functionalities extends Base{
	Customer_Order_Product_Page confirmStatus = new Customer_Order_Product_Page(driver);
	Customer_Order_List_Page custOrderList = new Customer_Order_List_Page(driver);
	
@Then("I will click Order Product")
public void i_will_click_Order_Product() {
	confirmStatus.click_orderProduct();
}

@Then("I select product")
public void i_select_product() {
	confirmStatus.select_Product("Pin");
}

@Then("I enter order date")
public void i_enter_order_date() {
	confirmStatus.order_date("2022-18-02");
}

@Then("I click order Product button")
public void i_click_order_Product_button() {
	confirmStatus.click_orderProdBtn();
}

@Then("I will see {string} home Page")
public void i_will_see_home_Page(String string) {
	assertEquals("Order List",custOrderList.OrderListLevel()); 
}

@Then("I click confirm button")
public void i_click_confirm_button() throws InterruptedException {
	custOrderList.click_confirmBtn(); 
	Thread.sleep(3000);
}

@Then("refresh Url")
public void refresh_Url() throws InterruptedException {
	driver.navigate().refresh();
	Thread.sleep(3000);
}

@Then("I will see {string} status")
public void i_will_see_status(String string) {
	System.out.println("complete "+ custOrderList.ConfirmedBtnLevelCheck());
	assertEquals("Confirmed",custOrderList.ConfirmedBtnLevelCheck()); 
}


}

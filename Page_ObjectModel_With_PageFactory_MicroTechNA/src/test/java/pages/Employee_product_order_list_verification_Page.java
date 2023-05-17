package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class Employee_product_order_list_verification_Page extends Base {
	
	WebDriver driver;

	public Employee_product_order_list_verification_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='Order List']")
	WebElement orderList;
	
	@FindBy(xpath = "//th[text()='Order ID']")
	WebElement orderId;
	
	@FindBy(xpath = "//th[text()='Employee ID']")
	WebElement EmpId;
	
	@FindBy(xpath = "//th[text()='Delivery Date']")
	WebElement DeliveryDate;
	
	@FindBy(xpath = "//th[text()='Product ID']")
	WebElement ProductId;
	
	@FindBy(xpath = "//th[text()='Order Date']")
	WebElement OrderDate;
	
	public void Click_OrderList() {
		orderList.click();;	
	}
	public String Check_orderId() {
		return orderId.getText();
	}
	public String Check_EmpId() {
		return EmpId.getText();
	}
	public String Check_DeliveryDate() {
		return DeliveryDate.getText();
	}
	public String Check_ProductId() {
		return ProductId.getText();
	}
	public String Check_OrderDate() {
		return OrderDate.getText();
	}
}

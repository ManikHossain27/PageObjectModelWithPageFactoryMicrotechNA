package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class Employee_product_order_page_verification_Page extends Base{

	WebDriver driver;

	public Employee_product_order_page_verification_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Product Order']")
	WebElement orderProd;
	
	@FindBy(xpath = "//h2[text()='Order Product']")
	WebElement orderProdLevel;
	
	@FindBy(xpath = "//p[text()='Employee ID']")
	WebElement empId;
	
	@FindBy(xpath = "//select/option[text()='Choose Product Name']")
	WebElement ChoceProdName;
	
	@FindBy(xpath = "//input[@name='ordDate']")
	WebElement date;
	
	@FindBy(xpath = "//button[text()='Order Product']")
	WebElement orderProdBtn;
	
	public void Click_OrderProduct() {
	    orderProd.click();;	
	}
	public String Check_orderProdLevel() {
		return orderProdLevel.getText();
	}
	public String Check_empIdLevel() {
		return empId.getText();
	}
//	public String Check_ChoceProdName(String prodname) {
//		return getAttributeValue(ChoceProdName, prodname);
//	}
	public String Check_date(String datee) {
		return date.getAttribute(datee);
	}
	public String Check_orderProdBtn() {
		return orderProdBtn.getText();
	}
}

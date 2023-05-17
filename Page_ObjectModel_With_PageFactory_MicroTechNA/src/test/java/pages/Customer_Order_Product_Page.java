package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.Base;

public class Customer_Order_Product_Page extends Base {
	
	WebDriver driver;

	public Customer_Order_Product_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='productOrder.php?id=4']")
	WebElement orderProduct;
	
	@FindBy(xpath = "//select[@name='prodId']")
	WebElement selectProduct;
	
	@FindBy(xpath = "//input[@name='ordDate']")
	WebElement orderDate;
	
	@FindBy(xpath = "//button[text()='Order Product']")
	WebElement orderProdBtn;
	
	public void click_orderProduct() {
		orderProduct.click();
	}
	
	public void select_Product(String prod)   {
	    selectProduct.click();
		Select dropdown = new Select(selectProduct);  
		dropdown.selectByVisibleText(prod);
	}
	
	public void order_date(String date) {
		orderDate.sendKeys(date);
	}
	
	public void click_orderProdBtn() {
		orderProdBtn.click();
	}
}

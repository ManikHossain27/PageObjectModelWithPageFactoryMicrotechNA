package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;


public class Customer_Order_List_Page extends Base {
	
	WebDriver driver;

	public Customer_Order_List_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()=' Order List ']")
	WebElement orderList;
	
	@FindBy(xpath = "//h1[text()='Order List']")
	WebElement orderListLevel;
	
	@FindBy(xpath = "//tbody/tr[last()]/td[last()]/a")
	WebElement confirmBtn;
	
	@FindBy(xpath="//tbody/tr[last()]/td[text()='Confirmed']")
	WebElement confirmedBtnLevel;
	
	public void click_orderList() {
		orderList.click();;
	}
	
	public String OrderListLevel() { 
		 return orderListLevel.getText();
	 }
	
	public void click_confirmBtn() {
		//List<WebElement> allElement = 
		confirmBtn.click();
//		int count= confirmBtn.size();
//		System.out.println(count);
//		confirmBtn.get(count-1).click();
//		
//		for(WebElement e : confirmBtn) {
//			if(e.getText().equals(e));
//		}
		
	}
	
	public String ConfirmedBtnLevelCheck() { 
		 return confirmedBtnLevel.getText();
	 }

}

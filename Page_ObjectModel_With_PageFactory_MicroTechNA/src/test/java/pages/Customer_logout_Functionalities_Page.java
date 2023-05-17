package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;



public class Customer_logout_Functionalities_Page extends Base {
	
	WebDriver driver;

	public Customer_logout_Functionalities_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Log Out']")
	WebElement Logout;

	@FindBy(xpath = "//h1[text()='Customer Login ']")
	WebElement custHomePageLevel;
	
	public void click_Logout() {
		Logout.click();;
	}
	public String CustHomePageLevel() {
		return custHomePageLevel.getText();
	}
	
}

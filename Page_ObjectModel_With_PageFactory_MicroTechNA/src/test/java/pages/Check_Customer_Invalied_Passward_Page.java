package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;


public class Check_Customer_Invalied_Passward_Page extends Base {
	

	WebDriver driver;

	public Check_Customer_Invalied_Passward_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "mailuid")
	WebElement emailId;
	
	@FindBy(name = "pwd")
	WebElement InValiedPassward;
	
	@FindBy(xpath = "//input[@name='login-submit']")
	WebElement login;
	
	@FindBy(xpath = "//span[text()='Invalid username or password!']")
	WebElement ip;
	
	public void enteremailId(String id) {
		//enterUserId.sendKeys(id);
		emailId.sendKeys(id);
	}
	
	public void enterUserpass(String pass) {
	InValiedPassward.sendKeys(pass);
	}
	
	public void clickLoginBtn() {
		login.click();;
	}
	
	public String InValiedPasswardCheck() {
		return ip.getText();
	}

}

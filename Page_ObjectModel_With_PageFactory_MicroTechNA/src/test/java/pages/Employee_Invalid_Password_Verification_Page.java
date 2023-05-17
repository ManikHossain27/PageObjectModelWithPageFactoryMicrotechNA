package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class Employee_Invalid_Password_Verification_Page extends Base{
   
	WebDriver driver;

	public Employee_Invalid_Password_Verification_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "pwd")
	WebElement password;

	@FindBy(xpath = "//input[@name='login-submit']")
	WebElement loginbtn;

	@FindBy(xpath = "//span[text()='Invalid username or password!']")
	WebElement invalidpass;
	
	public void Enter_Pass(String pass) {
		password.sendKeys(pass);
	}
	public void Click_Login() {
		loginbtn.click();
	}
	public String Check_Invalid_Pass() {
		return invalidpass.getText();
	}
}

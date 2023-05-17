package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class Employee_login_functionalities_Page extends Base{
	
	WebDriver driver;

	public Employee_login_functionalities_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div//h1")
	WebElement empLoginPage;

	@FindBy(name = "mailuid")
	WebElement userID;

	@FindBy(name = "pwd")
	WebElement pass;

	@FindBy(name = "login-submit")
	WebElement emploginbtn;

	@FindBy(xpath = "//h2[text()='Welcome Test ']")
	WebElement empHomePage;

 public String Emp_Login_Page() {
	 return empLoginPage.getText();
 }
 public void enter_User_Id(String id) {
		//enterUserId.sendKeys(id);
		userID.sendKeys(id);
	}
 public void enter_User_pass(String password) {
		//enterUserId.sendKeys(id);
		pass.sendKeys(password);
	}
 public void click_Emp_Login_Btn() {
		emploginbtn.click();
}
 public String Emp_Home_Page() {
	 return empHomePage.getText();
 }
}

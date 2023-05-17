package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class Employee_logout_Functionalities_Page extends Base{
	
	WebDriver driver;

	public Employee_logout_Functionalities_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='Log Out']")
	WebElement empLogoutBtn;
	
	@FindBy(xpath = "//h1[text()='Employee Login ']")
	WebElement emploginPage;
	
	public void click_Emp_Logout_Btn() {
		empLogoutBtn.click();
	}
	public String Emp_Login_Page() {
		 return emploginPage.getText();
	 }
}

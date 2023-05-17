package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;



public class AdminHomePage extends Base{
	WebDriver driver;

	public AdminHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//h2[text()='Employee Leaderboard ']")
	WebElement adminEmpLeaderboard;
	
	@FindBy(xpath="//a[text()='Employee']")
	WebElement clickEmpBtn;
	
	public String Admin_Home_Page_Level() {
		 return adminEmpLeaderboard.getText();
	 }
	 public void click_Emp_Btn() {
		 clickEmpBtn.click();
	}
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;


public class AdminEmployeeLeavePage extends Base {
	WebDriver driver;

	public AdminEmployeeLeavePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Employee Leave']")
	WebElement clickEmpLeaveBtn;
	
	@FindBy(xpath="//tbody/tr[46]/td[9]/a[text()='Approve']")
	WebElement clickApproveBtn;
	
	@FindBy(xpath="//tbody/tr[46]/td[8]")
	WebElement clickApproveBtnLevel;
	
	 public void click_Emp_Leave_Btn() {
		 clickEmpLeaveBtn.click();
	}
	 
	 public void click_Approve_Btn() {
		 clickApproveBtn.click();
	}
	 public String Admin_Approve_Level() {
		 return clickApproveBtnLevel.getText();
	 }
	
}

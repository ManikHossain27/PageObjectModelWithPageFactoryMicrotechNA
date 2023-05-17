package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class Employee_Apply_leave_Verification_Page extends Base{
	
	WebDriver driver;

	public Employee_Apply_leave_Verification_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Apply Leave']")
	WebElement applyLeave;
	
	@FindBy(xpath = "//h2[text()='Apply Leave Form']")
	WebElement applyLeavelevel;
	
	@FindBy(xpath = "//input[@name='reason']")
	WebElement applyLeaveReasonbtn;
	
	@FindBy(xpath = "//p[text()='Start Date']")
	WebElement startDate;
	
	@FindBy(xpath = "//p[text()='End Date']")
	WebElement endDate;
	
	@FindBy(xpath = "//input[@name='start']")
	WebElement enterstartDate;
	
	@FindBy(xpath = "//input[@name='end']")
	WebElement enterendDate;
	
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submitBtn;
	
	public void click_applyLeaveButton() {
		applyLeave.click();;
	}
	
	public String ApplyLeavelevelCheck() { 
		 return applyLeavelevel.getText();
	 }
	public String applyLeaveReasonBtn(String reason) { 
		 return applyLeaveReasonbtn.getAttribute(reason);
	 }
	public void applyLeaveReason(String reason) { 
		applyLeaveReasonbtn.sendKeys(reason);
	 }
	public String StartDateCheck() { 
		 return startDate.getText();
	 }
	public void StartDate(String date) { 
		enterstartDate.sendKeys(date);
	 }
	public String EndDateCheck() { 
		 return endDate.getText();
	 }
	public void EndDate(String date) { 
		enterendDate.sendKeys(date);
	 }
	public String SubmitButtonCheck() { 
		 return submitBtn.getText();
	 }
	public void click_Submit_Button() {
		submitBtn.click();
	}
	
	
	
}

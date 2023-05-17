package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class Employee_profile_verification_Page extends Base{
	
	WebDriver driver;

	public Employee_profile_verification_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='My Profile']")
	WebElement myProfile;

	@FindBy(xpath = "//h2[text()='My Info']")
	WebElement myInfolevel;

	public void click_myProfile() {
		myProfile.click();;
	}
	
	public String My_Info_LevelCheck() { 
		 return myInfolevel.getText();
	 }
}

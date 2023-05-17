package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class CustomerProfileVerificationPage  extends Base{

	WebDriver driver;

	public CustomerProfileVerificationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='My Profile']")
	WebElement MyProfile;
	
	@FindBy(xpath = "//h2[text()='My Info']")
	WebElement MyInfo;
	
	@FindBy(xpath = "//p[text()='First Name']")
	WebElement firstName;
	
	@FindBy(xpath = "//p[text()='Last Name']")
	WebElement LastName;
	
	@FindBy(xpath = "//p[text()='Email']")
	WebElement email;
	
	@FindBy(xpath = "//p[text()='Date of Birth']")
	WebElement birthdate;
	
	@FindBy(xpath = "//p[text()='Gender']")
	WebElement gender;
	
	@FindBy(xpath = "//p[text()='Contact Number']")
	WebElement contact;
	
	@FindBy(xpath = "//p[text()='Address']")
	WebElement address;
	
	
	public void click_MyProfile() {
		MyProfile.click();
}
	 public String get_MyInfo() { 
		 return MyInfo.getText();
	 }
	 public String fname() { 
		 return firstName.getText();
	 }
	 public String lname() { 
		 return LastName.getText();
	 }
	 public String ename() { 
		 return email.getText();
	 }
	 public String bname() { 
		 return birthdate.getText();
	 }
	 public String gname() { 
		 return gender.getText();
	 }
	 public String cname() { 
		 return contact.getText();
	 }
	 public String aname() { 
		 return address.getText();
	 }
	 

}

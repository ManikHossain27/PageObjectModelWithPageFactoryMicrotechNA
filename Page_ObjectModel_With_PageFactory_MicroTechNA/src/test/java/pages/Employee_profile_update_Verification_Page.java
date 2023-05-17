package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class Employee_profile_update_Verification_Page extends Base{
	
	WebDriver driver;

	public Employee_profile_update_Verification_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Update Info']")
	WebElement updateInfoButton;
	
	@FindBy(xpath = "//h2[text()='Update Employee Info']")
	WebElement updateInfolevel;
	
	@FindBy(xpath = "//input[@name='contact']")
	WebElement updateContact;
	
	@FindBy(xpath = "//input[@name='address']")
	WebElement updateAddress;
	
	@FindBy(xpath = "//button[@name='update']")
	WebElement clickSubmit;
	
	@FindBy(name = "contact")
	WebElement updatedContact;
	
	@FindBy(name = "address")
	WebElement updatedAddress;
	
	public void click_UpdateInfoButton() {
		updateInfoButton.click();
	}
	public String UpdateInfolevelCheck() { 
		 return updateInfolevel.getText();
	 }
	public void Update_Contact(String contact) {
		updateContact.sendKeys(contact); 
	}
	public void Update_Address(String address) {
		updateAddress.sendKeys(address); 
	}
	public void click_SumitButton() {
		clickSubmit.click();
	}
	public void UpdateContact() {
		updateContact.clear();
	 }
	public void UpdateAddress() {
		updateAddress.clear();
	 }
	public String UpdatedContact(String contact) { 
		return updateContact.getAttribute(contact);
	 }
	public String UpdatedAddress(String name) { 
		return updateAddress.getAttribute(name);
	 }
	
}

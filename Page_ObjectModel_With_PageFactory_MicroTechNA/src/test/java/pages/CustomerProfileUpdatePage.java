package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;


public class CustomerProfileUpdatePage extends Base {
	
	WebDriver driver;

	public CustomerProfileUpdatePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@name='send']" )
	WebElement UpdateInfo;
	
	@FindBy(xpath = "//h2[text()='Update Customer Info']")
	WebElement UpdateInfolevel;
	
	@FindBy(xpath = "//input[@name='contact']")
	WebElement UpdateContact;
	
	@FindBy(xpath = "//input[@name='address']")
	WebElement UpdateAddress;
	
	@FindBy(xpath = "//button[@name='update']")
	WebElement submit;
	
	@FindBy(name = "contact")
	WebElement updatedCont;
	
	@FindBy(name = "address")
	WebElement updatedAddress;
	
	
	public void click_Update_Info() {
		//click(UpdateInfo);
		UpdateInfo.click();
	 }
	public String fname() { 
		// return getText(UpdateInfolevel);
		return UpdateInfolevel.getText();
	 }
	public void cname(String name) { 
		  //sendKeys(UpdateContact,name);
		UpdateContact.sendKeys(name);
	 }
	public void aname(String name) { 
		  UpdateAddress.sendKeys(name);
	 }
	public void submitbtn() {
		//click(submit);
		submit.click();
	 }
	public void UpdateContact() {
		//clear(UpdateContact);
		UpdateContact.clear();
	 }
	public void UpdateAddress() {
		//clear(UpdateAddress);
		UpdateAddress.clear();
	 }
	public String UpdatedCont(String contact) { 
		//return getAttributeValue(updatedCont,contact);
		return updatedCont.getAttribute(contact);
	 }
	public String UpdatedAddress(String name) { 
		return updatedAddress.getAttribute(name);
	 }

}

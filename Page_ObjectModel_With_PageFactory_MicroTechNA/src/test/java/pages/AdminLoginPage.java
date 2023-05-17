package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;


public class AdminLoginPage extends Base {
	WebDriver driver;

	public AdminLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//ul/li[4]")
	WebElement adminLogin;
	
	@FindBy(xpath="//input[@name='mailuid']")
	WebElement email;
	
	@FindBy(xpath="//input[@name='pwd']")
	WebElement pass;
	
	@FindBy(xpath="//input[@name='login-submit']")
	WebElement LoginBtn;
	
	public void click_AdminLoginBtn() {
		adminLogin.click();
	}
	
	public void enter_User_Email(String emailS) {	
		email.sendKeys(emailS);
	}
    public void enter_User_pass(String password) {
		pass.sendKeys(password);
	}
    
    public void click_Admin_Login_Btn() {
    	LoginBtn.click();
}
}

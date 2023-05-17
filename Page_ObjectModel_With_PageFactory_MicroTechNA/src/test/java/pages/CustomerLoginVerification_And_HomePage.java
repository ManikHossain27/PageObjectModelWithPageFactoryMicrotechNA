package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class CustomerLoginVerification_And_HomePage extends Base {
	WebDriver driver;
	public CustomerLoginVerification_And_HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// By WelcomeText = By.xpath("//h1[text()='Welcome to MicroTech NA.']");
	// By Login =By.xpath("//a[@href='elogin.php']");
	// By clickCustomer=By.xpath("//a[text()='Customer Login']");
	// By userId=By.name("mailuid");
	// By userPassword=By.name("pwd");
	// By login=By.xpath("//input[@name='login-submit']");
	// By WelcomeDavid=By.xpath("//h2[text()='Welcome David']");

	@FindBy(xpath = "//a[@href='elogin.php']")
	WebElement loginbtnClick;

	@FindBy(xpath = "//a[text()='Customer Login']")
	WebElement customerbtnClick;

	@FindBy(name = "mailuid")
	WebElement enterUserId;

	@FindBy(name = "pwd")
	WebElement enterUserPassword;

	@FindBy(xpath = "//input[@name='login-submit']")
	WebElement loginClick;

	@FindBy(xpath = "//h2[text()='Welcome David']")
	WebElement WelcomeDavid;

	

//	public String welcomeText() {
//		return getText(WelcomeText);
//	}
	public void click_Login() {
		// driver.findElement(Login).click();
		loginbtnClick.click();
		// click(Login);
	}

	public void click_Customer_Login() {
		customerbtnClick.click();
		// click(clickCustomer);
	}

	public void enterUserId(String id) {
		enterUserId.sendKeys(id);
		// sendKeys(userId,id);
	}

	public void enteruserpassword(String Password) {
		enterUserPassword.sendKeys(Password);
		// sendKeys(userPassword,Password);
	}

	public void clickLoginBtn() {
		loginClick.click();
		// click(login);
	}

	public String getWelcomeText() {
		return WelcomeDavid.getText();
		// return getText(WelcomeDavid);
	}

}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class LandingPage extends Base {

	WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// By WelcomeText = By.xpath("//h1[text()='Welcome to MicroTech NA.']");
	@FindBy(xpath = "//h1[text()='Welcome to MicroTech NA.']")
	WebElement WelcomeText;

	public void navigateURL() {
		driver.get("https://it.microtechlimited.com/");
	}

	public String welcomeText() {
		return WelcomeText.getText();
	}

}

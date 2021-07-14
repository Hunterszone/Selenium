package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebsiteLogout {

	WebDriver driver;

	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//button[text()='Login']")
	WebElement login;
	
	@FindBy(id = "logout")
	WebElement logout;

	public WebsiteLogout(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public void setUsername(String usr) {
		username.sendKeys(usr);
	}

	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void clickLogin() {
		login.click();
	}
	
	public void clickLogout() {
		logout.click();
	}

	public void loginToSite(String usr, String pwd) {
		this.setUsername(usr);
		this.setPassword(pwd);
		clickLogin();
	}
}
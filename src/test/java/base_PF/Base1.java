package base_PF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Base1 {

	WebDriver driver;

	public Base1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "user-name")
	WebElement Txt_username;

	@FindBy(id = "password")
	WebElement Txt_password;

	@FindBy(id = "login-button")
	WebElement loginbutton;

	@FindBy(id = "react-burger-menu-btn")
	WebElement reactbutton;

	@FindBy(id = "logout_sidebar_link")
	WebElement logout;

	public void enterUsername(String uname) {
 
		Txt_username.sendKeys(uname);
	}

	public void enterPassword(String pwd) {
		Txt_password.sendKeys(pwd);
	}

	public void clickOnLogin() {
		loginbutton.click();
	}

	public void clickOnReactButton() {
		reactbutton.click();
	}

	public void clickOnLogout() {
	    logout.click();
	}

}

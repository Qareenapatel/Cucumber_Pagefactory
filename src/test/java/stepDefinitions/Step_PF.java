package stepDefinitions;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base_PF.Base1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_PF {

	WebDriver driver;
    Base1 loginn;
	
	@Given("user open chrome browser")
	public void user_open_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/patel/Webdriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
	}

	@When("user enter url {string}")
	public void user_enter_url(String url) {
		driver.get(url);
	}
	

	@Then("users enters username as {string} and password as {string}")
	public void users_enters_username_as_and_password_as(String uname, String pwd) {
		loginn = new Base1(driver);
	    loginn.enterUsername(uname);
	    loginn.enterPassword(pwd);
	}

	@Then("users click on login button")
	public void users_click_on_login_button() {
	   loginn.clickOnLogin(); 
	}

	@Then("user click on react button")
	public void user_click_on_react_button() {
	    loginn.clickOnReactButton();
	}

	@Then("users click on logout button")
	public void users_click_on_logout_button() {
	    loginn.clickOnLogout();
	}

	@Then("user close the browser")
	public void user_close_the_browser() {
	    driver.quit();
	}

}

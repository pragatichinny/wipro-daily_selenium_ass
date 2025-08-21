package Step_Defination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChangeLoginName {
	WebDriver driver;
    WebDriverWait wait;
	@Given("User is logged in")
	public void user_is_logged_in() {
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.ebay.com/");
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("userid")).sendKeys("mangalipragati98@gmail.com");
        driver.findElement(By.id("signin-continue-btn")).click();
        driver.findElement(By.id("pass")).sendKeys("Pragati@123");
        driver.findElement(By.id("sgnBt")).click();
	    
	}

	@When("User navigates to Account settings")
	public void user_navigates_to_account_settings() {
		driver.findElement(By.linkText("Mangali!")).click();
		driver.findElement(By.cssSelector("#s0-1-4-9-3\\[0\\]-0-9-dialog > div > div > ul > li:nth-child(2) > a")).click();
		driver.findElement(By.id("account-settings-link-PI")).click();
	    
	}

	@When("User changes Name")
	public void user_changes_name() {
		driver.findElement(By.id("individual_username_edit_button")).click();
		driver.findElement(By.id("user_name")).sendKeys("Chinny");
		driver.findElement(By.id("username_submit_edit_btn")).click();
	    
	}

	@Then("User should see as the login name")
	public void user_should_see_as_the_login_name() {
		System.out.println("Login Name changed");
		driver.close();
	    
	}



}

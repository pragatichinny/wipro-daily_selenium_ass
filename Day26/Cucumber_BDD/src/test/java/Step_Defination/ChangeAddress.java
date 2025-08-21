package Step_Defination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChangeAddress {
	WebDriver driver;
    WebDriverWait wait;
	@Given("User should logged in")
	public void user_should_logged_in() {
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

	@When("User navigates to Address Book")
	public void user_navigates_to_address_book() {
		driver.findElement(By.linkText("Mangali!")).click();
		driver.findElement(By.cssSelector("#s0-1-4-9-3\\[0\\]-0-9-dialog > div > div > ul > li:nth-child(2) > a")).click();
		driver.findElement(By.cssSelector("#account-settings-link-ADDR")).click();
	   
	}

	@When("User updates address")
	public void user_updates_address() {
		driver.findElement(By.cssSelector("#mainContent > div > div > div.account-tab-wrapper > div.fake-tabs > div > div > div > div > div > div > section.container--uas-main-content > div > div > div.addresses__content > div.address-type.primaryShipAddress > div > div:nth-child(2) > a")).click();
		driver.findElement(By.id("edit-address-SHIPPING")).click();
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div[2]/div/form/div[3]/span[1]/span/input")).sendKeys("123 New Street, NY");
		driver.findElement(By.id("save-address-btn")).click();
		
	    
	}

	@Then("The updated address should be saved successfully")
	public void the_updated_address_should_be_saved_successfully() {
		System.out.println("Address saved");
		driver.close();
	    
	}


}

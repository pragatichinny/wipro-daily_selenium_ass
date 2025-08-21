package Step_Defination1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Sell {
	WebDriver driver;
    WebDriverWait wait;
	@Given("Home page on browser")
	public void home_page_on_browser() {
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.ebay.com/");
	   
	}

	@When("click on sell")
	public void click_on_sell() {
		driver.findElement(By.cssSelector("#gh > nav > div.gh-nav__right-wrap > span > a")).click();
	    
	}

	@When("click on tips for listing")
	public void click_on_tips_for_listing() {
		driver.findElement(By.cssSelector("#mainContent > div.menu > div > nav > ul > li:nth-child(2) > a")).click();
	   
	}

	@Then("tips for listing appear")
	public void tips_for_listing_appear() {
		driver.close();
	    
	}


}

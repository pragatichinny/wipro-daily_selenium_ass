package Step_Defination1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DailyDeal {
	WebDriver driver;
    WebDriverWait wait;
	@Given("Home page")
	public void home_page() {
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.ebay.com/");
	    
	}

	@When("click on daily deals")
	public void click_on_daily_deals() {
		driver.findElement(By.cssSelector("#gh > nav > div.gh-nav__left-wrap > span:nth-child(2) > a")).click();
	    
	}

	@When("search for item")
	public void search_for_item() {
		 WebElement search=driver.findElement(By.id("gh-ac"));
	 	   search.sendKeys("iphone");
	 	   search.sendKeys(Keys.ENTER);
	    
	}

	@Then("items on Daily deals appear")
	public void items_on_daily_deals_appear() {
		System.out.println("Daily deals item appear");
		driver.close();
	    
	}


}

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

public class BrandOutlet {
	WebDriver driver;
    WebDriverWait wait;
	@Given("Ebay Home page for validate")
	public void ebay_home_page_for_validate() {
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.ebay.com/");
		
	}

	@When("click on brand outlet")
	public void click_on_brand_outlet() {
		driver.findElement(By.cssSelector("#gh > nav > div.gh-nav__left-wrap > span:nth-child(3) > a")).click();
	    
	}

	@When("search an item")
	public void search_an_item() {
		WebElement search=driver.findElement(By.id("gh-ac"));
	 	   search.sendKeys("bag");
	 	   search.sendKeys(Keys.ENTER);
	    
	}

	@Then("item dispaly according to brand")
	public void item_dispaly_according_to_brand() {
		driver.close();
	    
	}

}

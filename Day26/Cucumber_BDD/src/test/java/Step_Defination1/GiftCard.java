package Step_Defination1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GiftCard {
	WebDriver driver;
    WebDriverWait wait;
	@Given("Ebay Home page")
	public void ebay_home_page() {
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.ebay.com/");
	    
	}

	@When("click on gift cards")
	public void click_on_gift_cards() {
		driver.findElement(By.cssSelector("#gh > nav > div.gh-nav__left-wrap > span:nth-child(4) > a")).click();
	    
	}

	@When("Click on start gifting and click on lets go")
	public void click_on_start_gifting_and_click_on_lets_go() {
		driver.findElement(By.cssSelector("#home-slide-0 > article > div > header > div > button")).click();
	    
	}

	@Then("hello gift cards")
	public void hello_gift_cards() {
		driver.close();
	    
	}
}

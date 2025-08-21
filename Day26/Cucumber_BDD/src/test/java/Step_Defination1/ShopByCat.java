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

public class ShopByCat {
	WebDriver driver;
    WebDriverWait wait;
	@Given("Home page in default browser")
	public void home_page_in_default_browser() {
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.ebay.com/");
	   
	}

	@When("user click on shope by category and select one category")
	public void user_click_on_shope_by_category_and_select_one_category() {
		driver.findElement(By.cssSelector("#gh > section > div > div > div > button > span")).click();
		driver.findElement(By.linkText("Electronics")).click();
	   
	}

	@When("search any item")
	public void search_any_item() {
		WebElement search=driver.findElement(By.id("gh-ac"));
	 	   search.sendKeys("watch");
	 	   search.sendKeys(Keys.ENTER);
		
		
	    
	}

	@Then("user able to shop")
	public void user_able_to_shop() {
		System.out.println("Shop by category work fine");
		driver.close();
	    
	}


}

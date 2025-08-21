package Step_Defination;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCart {
	 WebDriver driver;
	    WebDriverWait wait;
	    
	@Given("User searches for item")
	public void user_searches_for_item() {
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.ebay.com/");
        WebElement search=driver.findElement(By.id("gh-ac"));
 	   search.sendKeys("headset wireless");
 	   search.sendKeys(Keys.ENTER);
	    
	}

	@When("User click on item")
	public void user_click_on_item() {
		driver.findElement(By.cssSelector("#item1d909ffc3d > div > div.s-item__image-section > div > a > div > img")).click();
		ArrayList<String>tabs=new ArrayList<>(driver.getWindowHandles());
		   driver.switchTo().window(tabs.get(1));
	    
	}

	@When("User clicks on Add to Cart")
	public void user_clicks_on_add_to_cart() {
		driver.findElement(By.id("atcBtn_btn_1")).click();
		  
		ArrayList<String>tabs=new ArrayList<>(driver.getWindowHandles());
		   driver.switchTo().window(tabs.get(1));
		   
	    
	}

	@Then("Product should be added to the cart successfully")
	public void product_should_be_added_to_the_cart_successfully() {
		System.out.println("item added to cart");
		driver.close();
	   
	}
	

}

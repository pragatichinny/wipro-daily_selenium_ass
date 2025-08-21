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

public class DeleteCart {
	 WebDriver driver;
	    WebDriverWait wait;
	@Given("user added item to cart")
	public void user_added_item_to_cart() {
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.ebay.com/");
        WebElement search=driver.findElement(By.id("gh-ac"));
  	   search.sendKeys("headset wireless");
  	   search.sendKeys(Keys.ENTER);
  	 driver.findElement(By.cssSelector("#item1d909ffc3d > div > div.s-item__image-section > div > a > div > img")).click();
		ArrayList<String>tabs=new ArrayList<>(driver.getWindowHandles());
		   driver.switchTo().window(tabs.get(1));
		   driver.findElement(By.id("atcBtn_btn_1")).click();
			   driver.switchTo().window(tabs.get(1));
			   WebElement cart=driver.findElement(By.cssSelector("#mainContent > div.vim.d-vi-evo-region > div.vim.vi-evo-row-gap > ul > li:nth-child(2) > div.vim.x-atc-action.overlay-placeholder.atcv3modal > div > div.lightbox-dialog__window.lightbox-dialog__window--animate.keyboard-trap--active > div.lightbox-dialog__main > div > div > div.x-atc-layer-v3--details > div.ux-section-module__container > div > div > div > div:nth-child(1) > a"));
			   cart.click();
	    
	}

	@When("click on cart icon")
	public void click_on_cart_icon() {
	
		driver.get("https://cart.ebay.com");
	    
	}

	@When("click on remove")
	public void click_on_remove() {
		driver.findElement(By.linkText("Remove")).click();
	    
	}

	@Then("item deleted from cart")
	public void item_deleted_from_cart() {
		System.out.println("item deleted from cart");
		driver.close();
	    
	}


}

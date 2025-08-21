package Step_Defination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChangeLang {
	WebDriver driver;
	 WebDriverWait wait;
	@Given("Home page should open in default browser")
	public void home_page_should_open_in_default_browser() {
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.ebay.com/");
        JavascriptExecutor jse=(JavascriptExecutor)driver;
		   jse.executeScript("window.scrollBy(0.1200)");
	    
	}

	@When("Click on united states select a option")
	public void click_on_united_states_select_a_option() {
		
		   
		   driver.findElement(By.cssSelector("#glbfooter > footer > div.gf-big-links > div:nth-child(5) > div:nth-child(3) > div > div > button")).click();
		   driver.findElement(By.linkText("China")).click();
	    
	}

	@Then("Language changed sucessfully")
	public void language_changed_sucessfully() {
	    System.out.println("Language changed");
	    driver.close();
	}


}

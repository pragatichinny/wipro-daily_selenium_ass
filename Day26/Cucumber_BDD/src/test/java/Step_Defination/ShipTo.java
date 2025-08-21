package Step_Defination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShipTo {
	WebDriver driver;
    WebDriverWait wait;
	@Given("ebay Home page")
	public void ebay_home_page() {
	    driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.ebay.com/");
	    
	}

	@When("click on ship to")
	public void click_on_ship_to() {
		driver.findElement(By.linkText("Ship to")).click();
	    
	}

	@When("click on shipping location select location")
	public void click_on_shipping_location_select_location() {
		driver.findElement(By.cssSelector("#nid-yvf-0 > button")).click();
		driver.findElement(By.cssSelector("#s0-0\\.7346602131116327-1\\[0\\]-countrymenu-content-menu > div:nth-child(95)")).click();
		driver.findElement(By.linkText("Done")).click();
	    
	}

	@When("click on done")
	public void click_on_done() {
		System.out.println("Ship location updated");
		driver.close();
	    
	}

	@Then("ship location updated")
	public void ship_location_updated() {
	    
	}


}

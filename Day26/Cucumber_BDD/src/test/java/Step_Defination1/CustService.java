package Step_Defination1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustService {
	WebDriver driver;
    WebDriverWait wait;
	@Given("ebay Home page in default browser")
	public void ebay_home_page_in_default_browser() {
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.ebay.com/");
	   
	}

	@When("click on help and contact")
	public void click_on_help_and_contact() {
		driver.findElement(By.cssSelector("#gh > nav > div.gh-nav__left-wrap > span:nth-child(5) > a")).click();
	    
	}

	@When("click on get help with an item")
	public void click_on_get_help_with_an_item() {
		driver.findElement(By.cssSelector("#popular_solution_2 > a > span > span.main_title")).click();
	    
	}

	@Then("customer service feature work fine")
	public void customer_service_feature_work_fine() {
		System.out.println("Work fine");
		driver.close();
	    
	}


}

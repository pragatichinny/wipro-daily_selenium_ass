package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	WebDriver driver;
	@Given("Home page should be open in default browser")
	public void home_page_should_be_open_in_default_browser() {
		driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
		
	    
	}
	@When("^click on search bar and enter (.*)$")
	public void click_on_search_bar_and_enter_search1(String search1) {
		WebElement search=driver.findElement(By.id("searchTerm"));
		search.click();
		search.sendKeys(search1);
		search.sendKeys(Keys.ENTER);
	}

	

	@Then("verifies search functionalities")
	public void verifies_search_functionalities() {
		System.out.println("verifies search functionalities");
	   
	}



}

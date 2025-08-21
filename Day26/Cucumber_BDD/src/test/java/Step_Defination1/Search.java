package Step_Defination1;

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
	@Given("Home page should be open in default browser with login")
	public void home_page_should_be_open_in_default_browser() {
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
	    
	}
	@When("^click on search and enter (.*)$")
	public void click_on_search_bar_and_enter_search1(String search2) {
		WebElement search=driver.findElement(By.id("gh-ac"));
		search.click();
		search.sendKeys(search2);
		search.sendKeys(Keys.ENTER);
	}

	

	@Then("search funtionalities work fine")
	public void verifies_search_functionalities() {
		System.out.println("search functionalities work fine");
		driver.close();
	   
	}



}

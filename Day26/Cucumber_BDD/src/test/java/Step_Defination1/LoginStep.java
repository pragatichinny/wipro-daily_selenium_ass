package Step_Defination1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	WebDriver driver;
	@Given("page should open in default browzer")
	public void page_should_open_in_default_browzer() {
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com/\"");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	}

	@When("click on sing in")
	public void click_on_sing_in() {
		driver.findElement(By.linkText("Sign in")).click();
	    
	}

	@When("click on username and enter email click on continue button")
	public void click_on_username_and_enter_email_click_on_continue_button() {
		driver.findElement(By.id("userid")).sendKeys("mangalipragati98@gmail.com");
        driver.findElement(By.id("signin-continue-btn")).click();

	    
	}

	@When("click on password and enter password click on submit")
	public void click_on_password_and_enter_password_click_on_submit() {
		driver.findElement(By.id("pass")).sendKeys("Pragati@123");
        driver.findElement(By.id("sgnBt")).click();
	    
	}

	@Then("login successfully")
	public void login_successfully() {
		System.out.println("login successfull");
		driver.close();
	    
	}


}

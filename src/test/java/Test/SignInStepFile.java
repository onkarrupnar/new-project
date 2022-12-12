package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SignInStepFile {

	public static WebDriver driver;
	
	
	@Before
	public void Before_hook() {
		System.out.println("precondition for each scenario");
	}
	
	@After 
	public void After_hook() {
		System.out.println("postcondition for each scenario");
	}
	
	
	@BeforeStep
	public void BeforeStep_hook() {
		System.out.println("precondition for each step");
	}
	
	@AfterStep
	public void AfterStep_hook() {
		System.out.println("postcondition for each step");
	}
	
	
	@Given("User open the browser")
	public void user_open_the_browser() {
	
		System.setProperty("Webdriver.chrome.driver",System.getProperty("user")+"//drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		System.out.println("open the login page");
	}

	
	@When("User enter the email")
	public void user_enter_the_email() {
		
		driver.findElement(By.id("email")).sendKeys("abcjfj@gmail.com");
	    System.out.println("enter username");
	}

	
	@When("User enters the password")
	public void user_enters_the_password() {
		
		driver.findElement(By.id("pass")).sendKeys("4685465");
	    System.out.println("enter password");
	}

	
	@Then("He clicks on login button")
	public void he_clicks_on_login_button() {
		
		driver.findElement(By.name("login")).click();
	  System.out.println("click on login button");
	}
	
	
	@When("user confirms password")
	public void user_confirms_password() {
	    System.out.println("confirm password");
	}

	@When("He selects the gender")
	public void he_selects_the_gender() {
		 System.out.println("gender selection");
	}

	@When("He Select date of birth")
	public void he_select_date_of_birth() {
		 System.out.println("select birthdate");
	}

	@Then("He clicks on submit button")
	public void he_clicks_on_submit_button() {
		 System.out.println("click submit button");
	}

}

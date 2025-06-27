package stepsDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;


public class Steps {

	WebDriver driver;
	@Given("the user is on nopCommerce login page")
	public void NavigateToPage() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[normalize-space()='Log in']")).click();
	}
	
	@When("the user entered valid credentials \\(username: {string}, password: {string})")
	public void the_user_entered_valid_credentials_username_password(String user, String pass) {
	    driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(user);
	    driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pass);
	}

	@When("the user clicks on login button")
	public void the_user_clicks_on_login_button() {
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
	}

	@Then("the user should be redirected to My account page")
	public void the_user_should_be_redirected_to_my_account_page() {
	    boolean loginStatus = driver.findElement(By.xpath("//a[@class='ico-account']")).isDisplayed();
	    Assert.assertEquals(loginStatus, true);
	}

	@Then("the welcome message should be displayed")
	public void the_welcome_message_should_be_displayed() {
		boolean welcomeText = driver.findElement(By.xpath("//h2[normalize-space()='Welcome to our store']")).isDisplayed();
		Assert.assertEquals(welcomeText, true);
		driver.quit();
	}
}























package Day03_Waits;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * Day-27
-----------
wait methods
------------

Synchronization

NoSuchElementException - Element is not present on the page. Synchronization.
ElementNotFoundException - Locator is in-correct



Thread.sleep(time in ms)
--------
Adv:
----
1) easy to use

DisAdv
-------------
1) if the time is not suffitient then you will get exception
2) it will wait for maximum time out. this will reduce the performace script.
3) multiple times 


implicit wait
-----------
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

Adv:
1) single time/one statement
2) it will not wait till maximum time if the element is availble
3) Applicable for all the elements
4) easy to use

Disadvantge:
1) if the time is not suffitient then you will get exception


explicit wait
-------------
works based on the time and condition

declaration
use

points
---------
1) Conditional based, it will work more effectively.
2) finding element is inclusive
3) it will wait for condition to be true, then consider the time
4) we need to write multiple statements for multiple elements 

conditions
--------
alertIsPresent()
elementSelectionStateToBe()
elementToBeClickable()
elementToBeSelected()
frameToBeAvaliableAndSwitchToIt()
presenceOfAllElementsLocatedBy()
presenceOfElementLocated()
textToBePresentInElement()
textToBePresentInElementLocated()
textToBePresentInElementValue()
titleIs()
titleContains()
visibilityOf()
visibilityOfAllElements()
visibilityOfAllElementsLocatedBy()
visibilityOfElementLocated()


Fluent wait
--------------
 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
       .withTimeout(Duration.ofSeconds(time))
       .pollingEvery(Duration.ofSeconds(time))
       .ignoring(NoSuchElementException.class);

   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
     public WebElement apply(WebDriver driver) {
       return driver.findElement(By.id("foo"));
     }
   });

driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
 */

public class WaitsDemo {

	public static void main(String[] args) {
		//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
// Timeout
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		
		
		
		
// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
// Explicit wait
		
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement loginButton = explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		loginButton.click();
//		WebElement DashBoard = explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[text()='Dashboard']")));
//		System.out.println(DashBoard.getText());
		
		
// Fluent Wait
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
										.withTimeout(Duration.ofSeconds(10))
										.pollingEvery(Duration.ofSeconds(2))
										.ignoring(NoSuchElementException.class);
				
		WebElement dashboard1 = fluentWait.until(new Function<WebDriver, WebElement>() 
		{
		     public WebElement apply(WebDriver driver) 
		     {
		       return driver.findElement(By.xpath("//h6[text()='Dashboard']"));
		     }
		   });
		
		System.out.println(dashboard1.getText());
		
		
		
		
		
	}
}

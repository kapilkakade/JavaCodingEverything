package Day05_AlertsHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
// click ok button and get normal alert
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(5000);
		
		// create object for alert class		
		Alert myalert = driver.switchTo().alert();  // alert is interface
		
		// accept
		myalert.accept();
		
		// validate success message
		WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
		System.out.println(result.getText());
		result.getText().equalsIgnoreCase("You successfully clicked an alert");
		
		
		
		
// confirm alerts		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(2000);
		System.out.println("Grabbing text of alert : " + driver.switchTo().alert().getText());    //    Grabbing text of alert 
		
		driver.switchTo().alert().accept();  // accepts the same
		
		// validate success message
		System.out.println(result.getText());
		result.getText().equalsIgnoreCase("You clicked: Ok");		
	
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();  // closes the alert
		
		// validate success message
		System.out.println(result.getText());
		result.getText().equalsIgnoreCase("You clicked: Cancel");
		
		
		
		
// prompt alert
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(2000);
		System.out.println("Grabbing text of alert : " + driver.switchTo().alert().getText()); 
		
		myalert.sendKeys("Welcome");
		myalert.accept();
		System.out.println(result.getText());
		result.getText().equalsIgnoreCase("You entered: Welcome");
		
		if (result.getText().contains("Welcome")) {
			System.out.println("Passed");
		}
		

	}

}

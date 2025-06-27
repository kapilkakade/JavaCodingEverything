package Day01_Introduction;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demo.nopcommerce.com");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();

		Thread.sleep(5000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();  // opens new tab
		
		
		Set <String> windowIds = driver.getWindowHandles();		
		
		
		
		
		
		
		
		driver.close();  // closes only active tab and not the other one
		
		driver.quit(); // closes all windows
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

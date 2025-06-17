package Day01_Introduction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();  // opens new tab
		
		driver.close();  // closes only active tab and not the other one
		
		driver.quit(); // closes all windows
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

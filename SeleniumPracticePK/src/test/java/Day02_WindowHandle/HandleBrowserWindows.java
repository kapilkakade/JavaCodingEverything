package Day02_WindowHandle;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set <String> windowsIDs = driver.getWindowHandles();   // remember : getWindowHandles() will return a set of windowsIDs
															   // we are converting the set into a List so as to access the each ID
		System.out.println(windowsIDs);
		

		
// Approach 1 : 
													
		List <String> windowList = new ArrayList(windowsIDs);
		
		String parentId = windowList.get(0);
		String childId = windowList.get(1);
		
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());  			// Human Resources Management Software | OrangeHRM HR Software
		
		
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());				// OrangeHRM
		
		
// Approach 2: looping statement
		for(String winID: windowsIDs) {
			String windowTitle = driver.switchTo().window(winID).getTitle();
			
			if(windowTitle.equals("OrangeHRM")) {
				System.out.println(driver.getCurrentUrl());   // https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
				//some actions / validations
				
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.quit();
		

	}

}

package Day05_Btn_CheckBox_Radio;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBox {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
// select one checkbox
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='sunday']"));
		
		System.out.println("Before Selection : "+checkbox.isSelected());
		checkbox.click();
		System.out.println("After Selection : "+checkbox.isSelected());

// capturing all checkboxes		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		System.out.println("Number of checkboxes : " + checkboxes.size());

		
// Selecting all checkboxes
		for (int i=0; i<checkboxes.size(); i++) {
			
			if(!checkboxes.get(i).isSelected()) {
				checkboxes.get(i).click();
			}
		}
		
// unselect last 3 checkboxes	
		
		for (int j=4; j<checkboxes.size();j++) {
			if (checkboxes.get(j).isSelected()) {
				checkboxes.get(j).click();
			}
		}
		
//// select specific checkboxes
//		
//		for (int k=0; k<checkboxes.size();k++) {
//			if (k==1 || k==3 || k==5) {
//				if (checkboxes.get(k).isSelected()) {
//					checkboxes.get(k).click();
//				}
//			}
//		}
		

//		Scanner sc = new Scanner(System.in);
//		String weekname = sc.next();
		String weekname = "Sunday";
		
		switch(weekname){
		case "Sunday"	: driver.findElement(By.xpath("//input[@id='sunday']")).click(); break;
		case "Monday"	: driver.findElement(By.xpath("//input[@id='monday']")).click(); break;
		case "Tuesday"	: driver.findElement(By.xpath("//input[@id='tuesday']")).click(); break;
		case "Wednesday": driver.findElement(By.xpath("//input[@id='wednesday']")).click(); break;
		case "Thursday"	: driver.findElement(By.xpath("//input[@id='thursday']")).click(); break;
		case "Friday"	: driver.findElement(By.xpath("//input[@id='friday']")).click(); break;
		case "Saturday"	: driver.findElement(By.xpath("//input[@id='saturday']")).click(); break;
		default 		: System.out.println("Invalid input week name");
		
		}
		
		
		
	}

}

package Day05_Btn_CheckBox_Radio;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleRadioButtons {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement male_rd = driver.findElement(By.xpath("//input[@id='male']"));
		WebElement female_rd = driver.findElement(By.xpath("//input[@id='female']"));
		
		System.out.println("Before Selection : ");
		System.out.println("Is male radio button selected? : "+ male_rd.isSelected());
		System.out.println("Is female radio button selected? : "+ female_rd.isSelected());
		
		System.out.println("After Selecting male: ");
		male_rd.click();
		System.out.println("Is male radio button selected? : "+ male_rd.isSelected());
		System.out.println("Is female radio button selected? : "+ female_rd.isSelected());
		
		
		
		
		
		
		
	}

}

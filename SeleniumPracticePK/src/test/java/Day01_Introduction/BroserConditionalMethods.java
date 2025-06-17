package Day01_Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BroserConditionalMethods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
// is displayed using webElement
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println("Display Logo status: " + logo.isDisplayed());
// is displayed boolean		
		boolean logoStatus = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println("Display logo status : " + logoStatus);
		
// is enabled
		boolean FirstNamestatus = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		System.out.println("FirstName Status : " + FirstNamestatus);
		
// is Selected
		WebElement male_rd = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_rd = driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println("Before Selection...........");
		System.out.println("Is male selected : " + male_rd.isSelected());
		System.out.println("Is female selected : " + female_rd.isSelected());
		
		System.out.println("After Selecting male..........");
		male_rd.click();
		System.out.println("Is male selected : " + male_rd.isSelected());
		System.out.println("Is female selected : " + female_rd.isSelected());
		
		System.out.println("After Selecting female..........");
		female_rd.click();
		System.out.println("Is male selected : " + male_rd.isSelected());
		System.out.println("Is female selected : " + female_rd.isSelected());
		
		boolean Newsletter = driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
		System.out.println("Is newsletter selected : " + Newsletter);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

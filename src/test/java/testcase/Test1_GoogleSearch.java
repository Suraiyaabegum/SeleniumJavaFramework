package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1_GoogleSearch {


	public static void main(String[] args) {
		googleSearch();
	}

	public static void googleSearch()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(); 
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("Automation Step by Step");
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER);
		act.perform();
		
		driver.close();
		System.out.println("Test Completed Successfully");		
	}
}
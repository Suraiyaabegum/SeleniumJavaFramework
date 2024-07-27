package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Demo {

	WebDriver driver=null;

	@BeforeTest
	public void setupTest() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver(); 
		driver.get("https://www.google.com/");
	}

	@Test
	public void googleSearch()
	{

		driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("Automation Step by Step");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER);
		act.perform();
	}

	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();
		System.out.println("Test Completed Successfully");	
	}
}
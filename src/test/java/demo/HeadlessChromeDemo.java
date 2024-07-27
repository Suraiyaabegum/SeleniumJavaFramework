package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessChromeDemo {
	public static void main(String[] args) {
		test();
	}


	public static void test() {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--headless");
				
		WebDriver driver=new ChromeDriver(option);
			
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Automation");

		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER);
		act.perform();

		driver.close();
		driver.quit();
		System.out.println("Test Completed Successfully");

	}
}

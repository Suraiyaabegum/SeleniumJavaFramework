package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import pages.GoogleSearchPage;

 public class GoogleSearchTest {
	 private static WebDriver driver=null;

 	public static void main(String[] args) {
 		googleSearch();
 	}

 	public static void googleSearch()
 	{
 		WebDriverManager.chromedriver().setup();
 		driver= new ChromeDriver(); 
 		driver.get("https://www.google.com/");
 		
 		GoogleSearchPage.textbox_search(driver).sendKeys("Automation Step by Step");
 		GoogleSearchPage.click_Enter(driver);
 	  
 		driver.close();
 		System.out.println("Test Completed Successfully");		
 	}
 }

package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	 private static WebDriver driver=null;
	 
		public static void main(String[] args) {
			googleSearchTest();
	 	}


	public static void googleSearchTest() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver(); 
		driver.get("https://www.google.com/");
		
		GoogleSearchPageObjects googleSearchPageObjects=new GoogleSearchPageObjects(driver);
		googleSearchPageObjects.setTextInSearchBox("Automation Step by Step");
		googleSearchPageObjects.click_Enter1(driver);
		
		driver.close();
 		System.out.println("Test Completed Successfully");	
	}
}

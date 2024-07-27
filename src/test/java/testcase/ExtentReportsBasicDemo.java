package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsBasicDemo {
	
	private static WebDriver driver=null;
	
	public static void main(String[] args) {
		
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter("spark.html");
		ExtentReports extent= new ExtentReports ();
		extent.attachReporter(sparkReporter);
				
		ExtentTest test1=extent.createTest("Google Search Test One");
		
		//Testing for pass scenario
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver(); 
		
		test1.log(Status.PASS, "Starting Test Case");
		driver.get("https://www.google.com/");
		test1.pass("Navigated to Google page successfully");
		
		driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("Automation Step by Step");
		test1.pass("Entered Test in Search Box");
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER);
		act.perform();
		test1.pass("Pressed Entered");
		
		driver.close();
		test1.pass("Browsed closed successfully");
		
		extent.flush(); // calling flush writes everything to the log file
		}
}
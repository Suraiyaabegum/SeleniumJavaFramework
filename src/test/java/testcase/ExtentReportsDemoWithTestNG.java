package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsDemoWithTestNG {
	ExtentSparkReporter extentSparkReporter;
	ExtentReports extent;
	private static WebDriver driver=null;

	@BeforeSuite
	public void setup() {
		extentSparkReporter= new ExtentSparkReporter("spark1.html");
		extent= new ExtentReports();                // Initialize ExtentReports 
		extent.attachReporter(extentSparkReporter); // and attach the Spark reporter
	}

	@BeforeTest
	public void setupTest() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver(); 
	}

	@Test
	public void test1() {
		ExtentTest test=extent.createTest("My TestNG Test", "TestNG Extent Report");
		test.log(Status.PASS, "Starting Test Case");
		driver.get("https://www.google.com/");
		test.pass("Navigated to Google page successfully");

		test.log(Status.INFO, "This step shows usage of logs(status, details)");
		test.info("This step shows usage of info(details)");
		test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());  //Adding a screenshot to a log is a little different as logs do not accept image paths directly. The path must be provided using MediaEntityBuilder.
		test.addScreenCaptureFromPath("screenshot.png");
	}
	@Test
	public void test2() {
		ExtentTest test=extent.createTest("My TestNG Test", "TestNG Extent Report");
		test.log(Status.INFO, "This step shows usage of logs(status, details)");
		test.info("This step shows usage of info(details)");
		test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
	}

	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();
		System.out.println("Test Completed Successfully");	
	}

	@AfterSuite
	public void tearDown() {
		extent.flush();
	}

}

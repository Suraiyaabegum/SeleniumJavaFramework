package listeners;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(listeners.TestNGListeners.class)
public class TestNGListenersDemo {

	@Test
	public void test1() {
		System.out.println("I am Inside Test 1");
	}
	@Test
	public void test2() {
		System.out.println("I am Inside Test 2");
		Assert.assertTrue(false);
	}
	@Test
	public void test3() {
		System.out.println("I am Inside Test 3");
		throw new SkipException("This test is Skipped");
	}
	@Test
	public void test7() {
		System.out.println("I am Inside Test 7 ");
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.get("http://google.com/");
        driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("Automation Step by Step");
        driver.close();	
	}
}
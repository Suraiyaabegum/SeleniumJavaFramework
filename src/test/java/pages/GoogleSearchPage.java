package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GoogleSearchPage {

	private static WebElement element=null; //private is used as it will be used only in this class

	public static WebElement textbox_search(WebDriver driver)
	{
		element=driver.findElement(By.name("q"));
		return element;
	}

	public static WebElement button_Search_Click(WebDriver driver) {
		element=driver.findElement(By.name("btnk"));
		return element;
	}
	
	public static void click_Enter(WebDriver driver ) {
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER);
		act.perform();
	}	
}

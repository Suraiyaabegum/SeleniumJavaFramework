package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleSearchPageObjects {
	
	WebDriver driver=null;	
	public GoogleSearchPageObjects(WebDriver driver)  //this driver is passed whenever any class create object for GoogleSearchPageObjects by passing driver as an argument
	{
		this.driver=driver;
	}
	
	
	By textbox_Search=By.name("q");
	By button_Search=By.name("btnk");
	
	public void setTextInSearchBox(String text) {
		driver.findElement(textbox_Search).sendKeys(text);
	}
	
	public void clickSearchButton() {
		driver.findElement(button_Search).sendKeys(Keys.RETURN);
	}
	
	public void button_Search_Click(WebDriver driver ) {
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER);
		act.perform();
	}	
	public void click_Enter1(WebDriver driver) {
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER);
		act.perform();
	}	
}
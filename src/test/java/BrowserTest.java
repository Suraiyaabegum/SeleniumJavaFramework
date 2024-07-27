
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {

	public static void main(String[] args) {

		String projectPath=System.getProperty("user.dir");
		System.out.println("projectPath: "+projectPath);
		//System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();

		//WebDriver driver=new ChromeDriver();  //For Chrome
		//WebDriver driver=new InternetExplorerDriver(); //For Internet Explorer

		driver.get("http://www.seleniumhq.org/");
		
		driver.close();
	}
}
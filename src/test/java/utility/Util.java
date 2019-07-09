package utility;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Util {

	//public RemoteWebDriver driver;
	public WebDriver driver;
	
	@BeforeMethod
	public void getDriver() throws MalformedURLException {
		
		/*
		 * System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); driver =
		 * new ChromeDriver();
		 */
		 
		
		
		/*
		 * DesiredCapabilities dr;
		 * 
		 * dr=DesiredCapabilities.chrome();
		 * 
		 * dr.setBrowserName("chrome");
		 * 
		 * dr.setPlatform(Platform.LINUX);
		 * 
		 * driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dr);
		 */
		 //if(System.getProperty("Browser").equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		//} 
	/*
	 * else { System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
	 * driver = new FirefoxDriver(); }
	 */
		driver.get("https://www.github.com/");
		System.out.println(driver.getTitle().toString());
		
	}

	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
	
}

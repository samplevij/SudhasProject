package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	static WebDriver driver=null;
	
	@Parameters({"browser","url"})
	@BeforeSuite
	public void initializeDriver(String browser,String url)
	{
		switch(browser)
		{
		case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}

}

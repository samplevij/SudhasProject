package commonActions;

import java.time.Duration;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUsages {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public CommonUsages(WebDriver driver)
	{
		this.driver = driver;
		wait= new WebDriverWait(driver,Duration.ofSeconds(15));
	}
	
	public void waitForElementToClick(WebElement element)
	{
		try {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		}catch(TimeoutException e)
		{
			e.printStackTrace();
		}
	}
	
	public void waitForVisibility(WebElement element)
	{
		try {
		wait.until(ExpectedConditions.visibilityOf(element));
		}catch(TimeoutException e)
		{
			e.printStackTrace();
		}
	}
	
	public void waitForSwitchingFrame(WebElement element)
	{
		try {
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
		}catch(TimeoutException e)
		{
			e.printStackTrace();
		}
	}
	
	public void waitForAlertPresence()
	{
		try {
		wait.until(ExpectedConditions.alertIsPresent());
		}catch(TimeoutException e)
		{
			e.printStackTrace();
		}
	}

	public void selectDropDown(WebElement element,String value)
	{
		Select select = new Select(element);
		select.selectByValue(value);
		
	}
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import commonActions.CommonUsages;

public class Flights {
	
	
	WebDriver driver;
	CommonUsages common;
	
	public Flights(WebDriver driver)
	{
		this.driver=driver;
		common = new CommonUsages(driver);
		PageFactory.initElements(driver, Home.class);
	}

	@FindBy(how=How.LINK_TEXT,using="SIGN-OFF")
	private WebElement logout;
	
	public void clickLogout()
	{
		common.waitForElementToClick(logout);
		logout.click();
	}

}

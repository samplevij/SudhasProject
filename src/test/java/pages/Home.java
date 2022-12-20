package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import commonActions.CommonUsages;

public class Home {
	
	WebDriver driver;
	CommonUsages common;
	
	public Home(WebDriver driver)
	{
		this.driver=driver;
		common = new CommonUsages(driver);
		PageFactory.initElements(driver, Home.class);
	}

	@FindBy(how=How.NAME,using="username")
	private WebElement username;
	
	@FindBy(how=How.NAME,using="password")
	private WebElement password;
	
	@FindBy(how=How.NAME,using="submit")
	private WebElement loginButton;
	
	public void enterUsername(String uname)
	{
		common.waitForVisibility(username);
		username.sendKeys(uname);
	}
	
	public void enterPassword(String pwd)
	{
		common.waitForVisibility(password);
		username.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		common.waitForElementToClick(loginButton);
		loginButton.click();
	}
	
}

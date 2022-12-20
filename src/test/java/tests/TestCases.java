package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Flights;
import pages.Home;
import utility.ReadingPropertyFile;

public class TestCases extends BaseTest {
	
	Home home;
	Flights flights;
	
	@Test(priority = 0)
	public void validLogin()
	{
		home = new Home(driver);
		home.enterUsername(ReadingPropertyFile.getCredentials("username"));
		home.enterPassword(ReadingPropertyFile.getCredentials("password"));
		home.clickLogin();
		assertTrue(driver.getTitle().equals("Login: Mercury Tours"));
	}
	
	@Test(priority = 1)
	public void Logout()
	{
		flights=new Flights(driver);
		flights.clickLogout();
				
	}

}

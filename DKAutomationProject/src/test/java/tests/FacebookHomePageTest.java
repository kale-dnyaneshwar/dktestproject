package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookHomePageTest {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.out.println("In before method");
		System.setProperty("webdriver.chrome.driver", "/Users/dkale/Downloads/chromedriver_win32 (5)/chromedriver.exe");
		
	}
	
	@Test
	public void facebookTitleTest()
	{
		driver =new ChromeDriver();		
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());		
		
	}
	
	@Test
	public void facebookUrlTest()
	{
		System.out.println(driver.getCurrentUrl());		
		
	}
	
	@AfterMethod
	public void quiteBrowser()
	{
		System.out.println("In after method");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("In before suite");
	}

	@AfterSuite
	public void afterSuite()
	{
		System.out.println("In after suite");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("In before class");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("In after class");
	}

	@BeforeTest
	public void beforeTest()
	{
		System.out.println("In before test");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("In after test");
	}
	
}

package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.base.FinalizablePhantomReference;

public class TC_Class1 {
	
	WebDriver webDriver;
	final String userName_element="/html/body/form/table/tbody/tr[1]/td[2]/input";
	final String password_element="/html/body/form/table/tbody/tr[2]/td[2]/input";
	final String signin_element="/html/body/form/table/tbody/tr[3]/td[2]/input[1]";
	final String userName_Value="mngr473825";
	final String password_Value="EnegamA";
	final String manager_ID="/html/body/div[3]/div/ul/li[1]/a";
	final String newCustomer_ID="/html/body/div[3]/div/ul/li[2]/a";
	final String fundTransfer="/html/body/div[3]/div/ul/li[10]/a";
			

	@BeforeTest
	public void beforetest()
	{
		System.out.println("Before Test");
		webDriver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hemant\\hemant_automation\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
	}
		
	@Test
	public void tc01LaunchURL() throws Exception
	{
		webDriver.manage().window().maximize();
		Thread.sleep(10000);
		webDriver.get("http://www.demo.guru99.com/V4/");
	}
	
	@Test
	public void tc02VerifyLaunchpage()
	{
		Assert.assertEquals(webDriver.getTitle(),"Guru99 Bank Hope Page");
		System.out.println("Home page heading is displayed");
	}
	
	@Test
	public void tc03EnterCredential()
	{
		webDriver.findElement(By.xpath(userName_element)).sendKeys("mngr473825");
		webDriver.findElement(By.xpath(password_element)).sendKeys("EnegamA");
		webDriver.findElement(By.xpath(signin_element)).click();
	}
	
	@Test
	public void tc04VerifyLoginPage()
	{
		Assert.assertTrue(webDriver.findElement(By.xpath(manager_ID)).isDisplayed(),"Manager ID Label is not displayed");
		System.out.println("Manager ID label is Display");
	}
	
	@Test
	public void tc05VerifyHyperlinks()
	{
		Assert.assertTrue(webDriver.findElement(By.xpath(newCustomer_ID)).isEnabled(),"New Customer Hyperlink is not displayed");
		System.out.println("New customer Hyperlink is displayed.");
		Assert.assertTrue(webDriver.findElement(By.xpath(fundTransfer)).isEnabled(),"Fund transfer Hyperlink is displayed");
		System.out.println("Fund transfer Hyperlink is displayed.");
	}			 

}

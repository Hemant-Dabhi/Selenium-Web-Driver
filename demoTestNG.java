package com.testNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demoTestNG {
	
	WebDriver driver;
	@Test
	public void loadDrivers()throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hemant\\hemant_automation\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
	}
	
	@Test(dependsOnMethods = {"loadDrivers"})
	public void putdata()throws Exception
	{
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);		
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
	}
	
	@Test(dependsOnMethods = {"putdata"})
	public void login()throws Exception
	{
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
	}
	
	@Test(dependsOnMethods = {"login"})
	public void logout() throws Exception
	{
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(2000);
	}
	@Test(dependsOnMethods = {"logout"})
	public void close()throws Exception
	{
		driver.close();
	}
}

package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {
	
	WebDriver driver;
	@BeforeTest
    public void beforeTest()
    {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hemant\\hemant_automation\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
    	driver=new ChromeDriver();
    }
    @Test(priority = 0)
    public void verifyHomePage2() {
    	System.out.println("Test Called");
    	driver.get("http://demo.guru99.com/test/newtours/");
    	String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }
    @AfterTest
    public void afterTest()
    {
    	System.out.println("After Test Called");
    	driver.close();
    }

}

package com.webdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_tab {
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hemant\\hemant_automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver .get("http://demo.guru99.com/popup.php");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Click Here")).click();
				
		String MainWindow=driver.getWindowHandle();
		 Set<String> s=driver.getWindowHandles();
		 Iterator<String> itr=s.iterator();
		 while (itr.hasNext()) {
			String childWindow= itr.next();
			
			if(!MainWindow.equals(childWindow))
			{
				driver.switchTo().window(childWindow);
				driver.findElement(By.name("email")).sendKeys("dbhhemant@gmail.com");
				driver.findElement(By.name("btnLogin")).click();
			}	
		}
		 driver.switchTo().window(MainWindow);
		 Thread.sleep(2000);
		driver.close();
		
	}

}

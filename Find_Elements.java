package com.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Elements {
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hemant\\hemant_automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/ajax.html");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("span._ngcontent-ahq-c55")).click();
		Thread.sleep(2000);
		
		List<WebElement> list=driver.findElements(By.name("name"));
		Thread.sleep(2000);
		System.out.println("No of elements found: "+list.size());
		Thread.sleep(2000);		
		
		
		/* driver.close(); */
	}

}

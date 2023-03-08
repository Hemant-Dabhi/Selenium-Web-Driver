/*"Action" CLass- Handling keyboard & mouse events is done using Advanced User Interface -API. It contavis Actions & Action CLass.
 * is used to handle keyboard and mouse event.
 * */

package com.webdriver;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Event {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hemant\\hemant_automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		Thread.sleep(2000);
		
		Actions builder=new Actions(driver);
		WebElement home=driver.findElement(By.linkText("Home"));
		org.openqa.selenium.interactions.Action link_home=builder
		.moveToElement(home)
		.build();
		link_home.perform();
		
		
		
	}

}

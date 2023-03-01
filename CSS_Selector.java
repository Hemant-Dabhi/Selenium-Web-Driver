package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector {
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hemant\\hemant_automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input.input_error.form_input")).sendKeys("standard_user");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[placeholder=Password]")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input.submit-button.btn_action")).click();
		Thread.sleep(2000);
		
		driver.close();
		
	}

}

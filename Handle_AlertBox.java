
/*https://stackoverflow.com/questions/71117723/how-to-automate-accept-cookies-pop-up-from-java-app-using-selenium
*/
package com.webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handle_AlertBox {
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hemant\\hemant_automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		/*
		 * new
		 * WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.
		 * xpath("//button[@id='save']//div[@class='action-wrapper']"))).click();
		 */
		
	    driver.findElement(By.name("cusid")).sendKeys("Hemant");
	    Thread.sleep(2000);
	    driver.findElement(By.name("submit")).click();
	    Thread.sleep(2000);
	    
	    Alert alert=driver.switchTo().alert();
	    Thread.sleep(2000);
	    
	    String str=driver.switchTo().alert().getText();
	    System.out.println(str);
	    Thread.sleep(2000);
	    
	    alert.accept();
	    Thread.sleep(2000);
	    
	    driver.close();
	    
		
		
	}

	
}

package org.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoSwt {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Throwable {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		
		alert.dismiss();
	
	    driver.findElement(By.xpath("//button[@id='promtButton']")).click();
 	    String text = alert.getText();
    	System.out.println(text);
     	alert.sendKeys("welcome");
		
		alert.accept();
		
		
		

	}

}

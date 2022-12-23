package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Methods {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.switchTo().frame("frame1");
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		driver.switchTo().parentFrame();
		WebElement element = driver.findElement(By.xpath("//b[@id='topic']"));
		String text = element.getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		String text1 = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
        System.out.println(text1);

	}

}

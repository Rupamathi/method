package org.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookTest {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement user = driver.findElement(By.name("email"));
		if(user.isDisplayed()) {
		user.sendKeys("rupa@1234");
		
		}
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.id("pass"));
		if(password.isEnabled()) {
		password.sendKeys("rupa007");
		}
		else {
			System.out.println("not exist");
		}
		Thread.sleep(3000);
		WebElement show = driver.findElement(By.linkText("Log in"));
		show.click();
		Thread.sleep(3000);
		WebElement forgot = driver.findElement(By.className("_97w4"));
		forgot.click();
		Thread.sleep(3000);
		WebElement cancel = driver.findElement(By.linkText("Cancel"));
		cancel.click();
		Thread.sleep(3000);
		WebElement signup = driver.findElement(By.className("_97w5"));
		signup.click();
		Thread.sleep(1000);
		WebElement month = driver.findElement(By.name("birthday_month"));
		month.sendKeys("oct");
		List<WebElement> tag = driver.findElements(By.tagName("a"));
		for(int i=0;i<tag.size();i++) {
			WebElement element = tag.get(i);
			String text = element.getText();
			System.out.println(text);
		}

	}

}

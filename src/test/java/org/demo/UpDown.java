package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpDown {

	public static void main(String[] args) throws Throwable {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	WebElement user = driver.findElement(By.id("email"));
	WebElement pwd = driver.findElement(By.id("pass"));
	WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	JavascriptExecutor js= (JavascriptExecutor)driver;
//	js.executeScript("arguments[0].setAttribute('value','rupa007')",user );
//	js.executeScript("arguments[0].setAttribute('value','007@')",pwd );
//	Object values = js.executeScript("return arguments[0].getAttribute('value')",user);
//	System.out.println(values);
//	js.executeScript("arguments[0].click()",login );
	
	js.executeScript("arguments[0].scrollIntoView(true)",user );
	Thread.sleep(2000);
	
	js.executeScript("arguments[0].scrollIntoView(false)",login );


	}

}

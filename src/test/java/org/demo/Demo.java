package org.demo;

import java.io.File;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Throwable{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
	
	
	WebElement source = driver.findElement(By.xpath("//*[contains(text(),'BANK')]"));
	WebElement desc = driver.findElement(By.xpath("(//*[@class='placeholder'])[1]"));
	Actions acc = new Actions(driver);
	acc.dragAndDrop(source, desc).build().perform();
	
	
	WebElement source1 = driver.findElement(By.xpath("(//a[contains(text(),' 5000')])[1]"));
	WebElement desc1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	Actions acc1 = new Actions(driver);
	acc1.dragAndDrop(source1, desc1).build().perform();
	
	
	WebElement source2 = driver.findElement(By.xpath(" (//*[contains(text(),'SALES')] )"));
	WebElement desc2= driver.findElement(By.xpath("//*[@class='placeholder'][1]"));
	Actions acc2 = new Actions(driver);
	acc2.dragAndDrop(source2, desc2).build().perform();
	
	
	WebElement source3 = driver.findElement(By.xpath("(//a[contains(text(),' 5000')])[2]"));
	WebElement desc3= driver.findElement(By.xpath("//*[@class='placeholder'][1]"));
	Actions acc3 = new Actions(driver);
	acc3.dragAndDrop(source3, desc3).build().perform();
	
	
	
	TakesScreenshot tk=(TakesScreenshot)driver;
	File SRC = tk.getScreenshotAs(OutputType.FILE);
	File des = new File("C:\\Users\\lalit\\OneDrive\\Desktop\\screenshot.jpeg");
	FileUtils.copyFile(SRC, des);
	
	
//	email.sendKeys("rupa710@");
//	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rupa1234");
//    driver.findElement(By.xpath("//span[text()='Forgot?']")).click();
//	driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
	
	
		
		
		
		
		
	
//		String url = driver.getCurrentUrl();
//		String pageSource = driver.getPageSource();
//		String title = driver.getTitle();
//		String windowHandle = driver.getWindowHandle();
//		Set<String> windowHandles = driver.getWindowHandles();
//		
//		System.out.println("Current url===>"+url);
////		System.out.println("page source===>"+pageSource);
//		System.out.println("title===>"+title);
//		System.out.println("WindowHandle===>"+windowHandle);
//		System.out.println("windowHandles===>"+windowHandles);
//		Set<Cookie> cookies = driver.manage().getCookies();
//		for(Cookie Cookie:cookies)
//			System.out.println(Cookie);
//	
		

	}
}

	


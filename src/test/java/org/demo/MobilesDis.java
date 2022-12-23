package org.demo;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MobilesDis {

	public static void main(String[] args) throws Throwable {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement element = driver.findElement(By.xpath("//input[@name='q']"));
		element.sendKeys("Redmi Mobiles",Keys.ENTER);
		
		Thread.sleep(2000);

		File f= new File("C:\\Users\\lalit\\OneDrive\\Desktop\\Redmi.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet s1 = w.createSheet("Excell");

		List<WebElement> web = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		
		for(int i =0;i<web.size();i++) {
			String s=web.get(i).getText();
		     System.out.println(s);
		

		
     
    	Row r = s1.createRow(i);
    	Cell cell = r.createCell(0);
	   cell.setCellValue(s);
	   
       
		}
		
			FileOutputStream o = new FileOutputStream(f);
		
	
		
		w.write(o);
		o.close();
       
	}
}
		
		
			
		
		
//		
//		Set<String> child = driver.getWindowHandles();
//		List<String>child1 = new ArrayList<String>(child);
//		driver.switchTo().window(child1.get(1));
//			String text = driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
//			System.out.println(text);
			
		
		
	
		



	

	


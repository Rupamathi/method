package org.demo;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.List;

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

public class TaskValues {

	public static void main(String[] args) throws InterruptedException, Throwable {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Redmi mobiles",Keys.ENTER);
		Thread.sleep(3000);
		File f = new File("C:\\Users\\lalit\\OneDrive\\Redmi.xlsx");
		Workbook w =new XSSFWorkbook();
		Sheet createSheet = w.createSheet("number 1");
		
		
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	
		for(int i=0;i<list.size();i++) {
			String text = list.get(i).getText();
			System.out.println(text);
			
			Row createRow = createSheet.createRow(i);
			Cell createCell = createRow.createCell(0);
			createCell.setCellValue(text);
			
	
			
		}
		FileOutputStream o = new FileOutputStream(f);
		w.write(o);
		o.close();
		
	
		
		
		
		
			
			
			
		
		

	}

}

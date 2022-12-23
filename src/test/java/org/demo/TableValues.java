package org.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableValues {

	public static void main(String[] args) {
	       
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html#:~:text=Practice%20Exercise%20with%20Solution%20Code%20-%20How%20to,the%20tallest%20structure%20in%20the%20table%20with%20Selenium");
           List<WebElement> t = driver.findElements(By.tagName("table"));
        for(int i=0;i<t.size();i++) {
        	WebElement element = t.get(i);
        WebElement body = element.findElement(By.tagName("tbody"));
        List<WebElement> row = body.findElements(By.tagName("tr"));
        
        for(int j=3;j<row.size()-3;j++) {
        	WebElement r = row.get(j);
        	 List<WebElement> data = r.findElements(By.tagName("td"));
        	 
        	 for(int x=0;x<data.size();x++) {
        		 WebElement d = data.get(x);
        		 String text = d.getText();
        		 System.out.println(text);
        		 
        		 
        		 
//        		 if(text.equals("Amazon")) {
//        			 System.out.println(text);
//        			 System.out.println("Row : "+j);
//        			 System.out.println("column : "+x);
//        		 }
//        			 if(text.contains("g")) {
//        				 System.out.println(text);
//        				 System.out.println("Row : "+j  +"  column : "+x);
//        				 
//        			 }
//        			 
        		 
        	 }
        }
        	
        	
        	   
           }
	}

}

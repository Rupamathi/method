package org.demo;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BrokenValues {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.meesho.com");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int broken=0;
		for(WebElement x:allLinks) {
			String href=x.getAttribute("href");
			String text = x.getText();
			System.out.println(text);
			try {
			    URL url = new URL(href);
			    HttpURLConnection con =(HttpURLConnection)url.openConnection();
			  int responsecode = con.getResponseCode();
			  if(responsecode!=200) {
				  System.out.println("link is broken");
				  System.out.println(href);
				  System.out.println(con.getResponseMessage());
			  }
			  }
			catch(Exception e) {
				System.out.println("broken 2");
			
				broken++;
			  }
			
			}
		

	}

}

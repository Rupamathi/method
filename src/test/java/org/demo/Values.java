package org.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Values {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
	driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	WebElement element = driver.findElement(By.xpath("//select[@id='first']"));
	
	Select s = new Select(element);
	s.selectByIndex(1);
	s.selectByVisibleText("Google");
	s.selectByValue("Apple");
	
	List<WebElement> Options = s.getOptions();
	for(int i =0;i< Options.size();i++) {
		WebElement webElement = Options.get(i);
		System.out.println(webElement.getText());
	}
		
		WebElement element1 = driver.findElement(By.xpath("//select[@id='animals']"));
		
		Select s1= new Select(element1);
		
		s1.selectByVisibleText("Big Baby Cat");
		s1.selectByVisibleText("Avatar");
		
WebElement element2 = driver.findElement(By.xpath("//select[@id='second']"));
		
		Select s2= new Select(element2);
		
		s2.selectByVisibleText("Pizza");
		s2.selectByVisibleText("Bonda");
		s2.selectByVisibleText("Donut");
		s2.deselectByVisibleText("Bonda");
		List<WebElement> allSelectedOptions = s2.getAllSelectedOptions();
		for(int i =0;i<allSelectedOptions.size();i++) {
		WebElement element3 = allSelectedOptions.get(i);
		System.out.println(element3.getText());
		}
		System.out.println(s2.getFirstSelectedOption().getText());
		
		
		
		
	
		

	}

}

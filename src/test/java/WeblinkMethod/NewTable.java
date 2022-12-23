package WeblinkMethod;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTable {
	WebDriver driver;
	long StartTime;long endTime;
  @Test
  public void sampleTest() {
	  List<WebElement> table1 = driver.findElements(By.xpath("(//table[@class='has-background'])[1]"));
	  for(int t=0;t<table1.size();t++) {
		  String text = table1.get(t).getText();
		  System.out.println(text);
	  }
		  List<WebElement> rows = driver.findElements(By.xpath("(//table[@class='has-background']//thead//tr)[1]"));
		  for(int r=0;r<rows.size();r++) {
			  String text2 = rows.get(r).getText();
			  System.out.println(text2);
		  }
			  List<WebElement> column = driver.findElements(By.xpath("(//table[contains(@class,'has-background')])[1]//tbody//tr//td"));
			  for(int d=0;d<column.size();d++) {
				  String text3 = column.get(d).getText();  
				  if(text3.contains("State")) {
				  System.out.println(text3);
			  }
			  }
			  
		  }
	  
  
 
  @BeforeTest
  public void beforeTest() {
	  StartTime = System.currentTimeMillis();
	  System.out.println("Starting==>> " +StartTime);
  }

  @AfterTest
  public void afterTest() {
	  endTime = System.currentTimeMillis();
	  long TotalTime=endTime-StartTime;
	  System.out.println("Ended==>> "+TotalTime);
  }

  @BeforeSuite
  public void beforeSuite() {
	  WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.get("https://bankingtides.com/home-loan-interest-rate-of-all-banks/#:~:text=Private%20Sector%20Banks%E2%80%99%20Home%20Loan%20Interest%20Rate%20,10.25%25%20to%2012.75%25%20%2018%20more%20rows%20");
  }

  @AfterSuite
  public void afterSuite() {
	 /* driver.quit();*/
  }

}

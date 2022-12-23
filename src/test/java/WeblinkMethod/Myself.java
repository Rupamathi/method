package WeblinkMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myself {
	WebDriver driver;
	long start ;
	 long end;
	@BeforeSuite
	public void launch() throws InterruptedException {
		 start = System.currentTimeMillis();
		 System.out.println("Start Time:"+start);
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://www.startlocal.com.au/");
	}
   @Test(priority=1)	public void searchText() throws Throwable {	 
		 WebElement search = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	      search.sendKeys("KFC");
	      Thread.sleep(1000);
   }
   @Test(priority=2) public void press() {
	      WebElement location = driver.findElement(By.xpath("(//input[@class='text predictive'])[3]"));
	      location.sendKeys("Trichy");
	      driver.findElement(By.xpath("(//input[@class='submit'])[2]")).click();
	}
   @AfterSuite public void complete() {
	   long end = System.currentTimeMillis();
	   long ending = (end-start);
	   System.out.println("EndTime:"+(ending));
   }
	


}

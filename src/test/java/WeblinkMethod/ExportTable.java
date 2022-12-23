package WeblinkMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExportTable {
	WebDriver driver;
	@Test
	public void launch() {
	
	WebDriverManager.edgedriver().setup();
	driver = new EdgeDriver();
	driver.get("https://www.askbankifsccode.com/blog/list-banks-in-india/");
	List<WebElement> table = driver.findElements(By.xpath("//figure[contains(@class,'wp-block-table')]"));
	for(int t=0;t<table.size();t++) {
		String text = table.get(t).getText();
	//System.out.println(text);
	}
	
	List<WebElement> row = driver.findElements(By.xpath("//figure[contains(@class,'wp-block-table')]//table//tbody//tr"));
    for(int r=0;r<row.size();r++ ) {
    	
    	
    	String value = row.get(r).getText();
    	if(value.contains("Bank of")) {
	System.out.println(value);
	
    	}
}
    List<WebElement> column = driver.findElements(By.xpath("//figure[contains(@class,'wp-block-table')]//table//tbody//td"));
    for(int d=0;d<column.size();d++ ) {
    
    	String value1 = column.get(d).getText();
    	if(value1.contains("foreign")) {

	System.out.println(value1);
    	}

}

}
}



package eCommerceWebSites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Amazon {
  @Test
  public void amazonTest() throws InterruptedException {
	  
	 
	  WebDriver driver=new ChromeDriver();
	  Reporter.log("Opening Amazon",true);
	  driver.get("https://www.amazon.in/");
	  Thread.sleep(8000);
	  driver.quit();
	  
	  
  }
}

package eCommerceWebSites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flipkart {
  @Test
  public void flipTest() throws InterruptedException {
	  
	  WebDriver driver=new ChromeDriver();
	  Reporter.log("Opening Flipkart",true);
	  driver.get("https://www.flipkart.com/");
	  System.out.println("Hi test message");
	  System.out.println("Hi message");
	  Thread.sleep(8000);
	  driver.quit();
  }
}

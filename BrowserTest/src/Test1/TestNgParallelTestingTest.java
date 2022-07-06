package Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestNgParallelTestingTest {
	
	WebDriver driver=null;
	
  @Test
  public void test1() throws Exception {
	  System.out.println("Executing test1 " +Thread.currentThread().getId());
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\sankar.venkatraman\\Desktop\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://www.google.com/");
	  Thread.sleep(3000);
	  driver.close();
	  
  }
  
  @Test
  public void test2() throws Exception {
	  System.out.println("Executing test2 " +Thread.currentThread().getId());
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\sankar.venkatraman\\Desktop\\chromedriver.exe"); WebDriver
		 * driver=new ChromeDriver(); driver.get("http://www.google.com/");
		 * Thread.sleep(3000); driver.close();
		 */
		
		  System.setProperty("webdriver.gecko.driver",
		  "C:\\Users\\sankar.venkatraman\\Desktop\\geckodriver.exe"); 
		  WebDriver driver =new FirefoxDriver(); 
		  driver.get("http://www.google.com/"); Thread.sleep(3000);
		  driver.close();
		 
  }
}

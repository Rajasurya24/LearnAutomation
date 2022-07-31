package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class suiteExample {
	WebDriver driver;
	
	@BeforeSuite
	public void beforeTC() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\libs\\chromedriver.exe");
	     driver=new ChromeDriver();
	}
	@AfterSuite
	public void afterTC() {
		 driver.quit();
	}
	
	@Test
	public void openGoogle(){
		driver.get("http://www.google.co.in"); 
	}
	
	@Test
	public void openfaceboook(){
		driver.get("http://www.facebook.com"); 
	}
	
	@Test
	public void openbing(){
		driver.get("http://www.bing.co.in"); 
	}
}

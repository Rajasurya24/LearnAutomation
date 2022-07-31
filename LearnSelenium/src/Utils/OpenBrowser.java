package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class OpenBrowser {
	static ReadProperties prop = new ReadProperties();
	 
	public WebDriver chrome() throws IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		String value = prop.getData("url");
		driver.get(value);
		 return driver;
	}

	public static void main(String[] args) throws IOException {

		OpenBrowser obj = new OpenBrowser();
		obj.chrome();
	}

}

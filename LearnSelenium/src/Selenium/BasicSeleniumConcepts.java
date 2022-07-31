package Selenium;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.*;

public class BasicSeleniumConcepts {

	public static WebDriver driver;

	OpenBrowser browser = new OpenBrowser();
	ReadProperties prop = new ReadProperties();

	public void login() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String value = prop.getData("url");
		driver.get(value);
		Thread.sleep(5000);
		WebElement name = driver.findElement(By.id("age"));
		System.out.println(name.getAttribute("title"));
		driver.quit();
	}

	public void selectable() throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String value = prop.getData("url");
		driver.get(value);
		Thread.sleep(5000);
		List<WebElement> Select = driver.findElements(By.xpath("//*[@id='selectable']/li"));
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).click(Select.get(0)).click(Select.get(1)).click(Select.get(2)).build().perform();
		driver.quit();
	}
	public void autoComplete() throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String value = prop.getData("url");
		driver.get(value);
		Thread.sleep(5000);
		WebElement txtBox = driver.findElement(By.id("tags"));
		txtBox.sendKeys("s");
		Thread.sleep(5000);
		List<WebElement> optionList = driver.findElements(By.xpath("//*[@id='ui-id-1']/li"));
		System.out.println(optionList.size());
		for (WebElement webElement : optionList) {
			if(webElement.getText().equals("Web Services")) {
				webElement.click();
				Thread.sleep(4000);
				break;
			}
		}
		
		
		driver.quit();
	}

	public static void main(String[] args) throws IOException, InterruptedException {

		BasicSeleniumConcepts obj = new BasicSeleniumConcepts();
		obj.autoComplete();
	}

}

package Selenium_Practise;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v129.page.model.FileHandler;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.Capabilities;


public class FIS_WebAutomation {


	WebDriver driver=new ChromeDriver();


	
	public void launching_browser() throws Exception {


		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("book");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//ul[@class='srp-results srp-list clearfix']/li")).click();
		WebElement ele=driver.findElement(By.xpath("//ul[@class='srp-results srp-list clearfix']/li"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		driver.findElement(By.xpath("(//ul[@class='srp-results srp-list clearfix']/li)[1]")).click();
		String parent =driver.getWindowHandle();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> iterator=windows.iterator();
		while(iterator.hasNext()) {
		String child=iterator.next();
			if(child!=parent) {
				driver.switchTo().window(child);
			}
			
		}
	    Actions action=new Actions(driver);
	    Thread.sleep(3000);
	    action.moveToElement(driver.findElement(By.xpath("//h2[contains(text(),'Your cart is empty')]"))).build().perform();
		String msg=driver.findElement(By.xpath("//h2[contains(text(),'Your cart is empty')]")).getText();
		if(msg.contains("Your cart is empty")) {
			System.out.println("cart is empty");
			
		}
		
		driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
		WebElement ele2=driver.findElement(By.xpath("//span[contains(text(),'1')]/parent::span)[1]"));
		wait.until(ExpectedConditions.elementToBeClickable(ele2));
		String s2=driver.findElement(By.xpath("//div[@class='gh-cart']//span[contains(text(),'1')]")).getText();
		if(s2.contains("1")) {
			System.out.println("cart updated with item 1");
			System.out.println("Test executed successfully");
		}
}


	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		FIS_WebAutomation browser=new FIS_WebAutomation();
		browser.launching_browser();

	}

}

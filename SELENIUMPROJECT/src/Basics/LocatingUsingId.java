package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class LocatingUsingId {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/ishit/OneDrive/Desktop/index1.html");
	Thread.sleep(2000);
	driver.manage().window().maximize();	
	Thread.sleep(2000);
	WebElement ref= driver.findElement(By.id("usernaame"));
	ref.sendKeys("Ishita");
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("12345");
	Thread.sleep(2000);
	driver.findElement(By.className("password")).sendKeys("password confirmed");
	Thread.sleep(2000);
	//driver.findElement(By.linkText("forgot password")).click();
	//Thread.sleep(2000);
	driver.findElement(By.tagName("a")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	driver.findElement(By.partialLinkText("for")).click();
	Thread.sleep(2000);
	driver.quit();
}
}
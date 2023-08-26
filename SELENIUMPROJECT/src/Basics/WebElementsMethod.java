package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Log in")).click();
	Thread.sleep(2000);
	WebElement ref=driver.findElement(By.id("Email"));
	ref.sendKeys("abc");
	Thread.sleep(2000);
	ref.clear();
	Thread.sleep(2000);
	ref.sendKeys("ishita");
	Thread.sleep(2000);
	driver.findElement(By.className("login-button")).submit();
	Thread.sleep(2000);
	driver.quit();
	
}
}

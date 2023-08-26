package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebPageLocatingUsingLogin {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.className("ico-login")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("Email")).sendKeys("ishita@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.className("password")).sendKeys("123!@#");
	Thread.sleep(2000);
	driver.findElement(By.id("RememberMe")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("span[class='forgot-password']")).click();
	Thread.sleep(2000);
	driver.findElement(By.className("login-button")).click();
	Thread.sleep(2000);
	driver.close();
	
}
}

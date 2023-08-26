package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopRegisterLocating {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./SOFTWARESELENIUM/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/login");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.className("ico-register")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("gender-female")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("gender-male")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("FirstName")).sendKeys("Ishita");
	Thread.sleep(2000);
	driver.findElement(By.name("LastName")).sendKeys("Biswas");
	Thread.sleep(2000);
	driver.findElement(By.id("Email")).sendKeys("ishita@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.name("Password")).sendKeys("12345@");
	Thread.sleep(2000);
	driver.findElement(By.name("ConfirmPassword")).sendKeys("12345@");
	Thread.sleep(2000);
	driver.findElement(By.id("register-button")).click();
	Thread.sleep(1000);
	driver.quit();
}
}

package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingCartXpathByAttribute {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./SOFTWARESELENIUM/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/login");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();  //xpath by text
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='ico-wishlist']")).click();     //xpath by attribute
}
}

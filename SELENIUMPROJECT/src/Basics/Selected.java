package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selected {
 public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
	
	WebElement select = driver.findElement(By.id("pollanswers-1"));
	select.click();
	 System.out.println("is it selected!!"+select.isSelected());
 }
}

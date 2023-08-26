package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
	if(search.isEnabled())
	{
		System.out.println("if it is enabled : "+search.isEnabled());
	}
	driver.close();
}
}

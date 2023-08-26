package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Displayed {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement display = driver.findElement(By.id("small-searchterms"));
	System.out.println("is it displayed!!: "+display.isDisplayed());

	WebElement diplayelement = driver.findElement(By.linkText("Shopping cart"));
	if(diplayelement.isDisplayed())
	{
		System.out.println("is it displayed!!" +diplayelement.isDisplayed());
	}
	driver.quit();
}
}

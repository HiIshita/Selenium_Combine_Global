package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssPropertyWebElement {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/account/orders?link=home_orders");
	WebElement signupbutton = driver.findElement(By.linkText("New to Flipkart? Create an account"));
	System.out.println(signupbutton.getCssValue("color"));
	System.out.println(signupbutton.getCssValue("font-weight"));
}
}
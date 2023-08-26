package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeTagNameText {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement name = driver.findElement(By.className("ico-login"));
	System.out.println(name.getTagName());
	System.out.println(name.getText());
	System.out.println(name.getAttribute("href"));
	driver.quit();
}
}

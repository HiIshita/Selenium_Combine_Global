package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	WebElement loginlink = driver.findElement(By.linkText("Log in"));
	System.out.println(loginlink.getAttribute("class"));
	WebElement Reg = driver.findElement(By.linkText("Register"));
	System.out.println(Reg.getAttribute("class"));
	Reg.sendKeys("ISHITA");
	System.out.println(Reg.getAttribute("value"));
	
}
}

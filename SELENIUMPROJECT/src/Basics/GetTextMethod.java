package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	//driver.manage().window().maximize();
	//Thread.sleep(2000);
	WebElement ref = driver.findElement(By.linkText("Log in"));
	System.out.println(ref.getText());
	WebElement ref1 = driver.findElement(By.id("dialog-notifications-success"));
	System.out.println(ref1.getTagName());
	WebElement ref2 = driver.findElement(By.xpath("//a[@href='/digital-downloads']"));
	System.out.println(ref2.getText());
	System.out.println(ref2.getTagName());
	System.out.println(driver.findElement(By.className("topic-html-content-header")).getTagName());
	System.out.println(driver.findElement(By.className("topic-html-content-header")).getText());
}
}

package practiceBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartClickToys {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com/toys/remote-control-toys/pr?sid=mgl,56m&otracker=nmenu_sub_Baby%20%26%20Kids_0_Remote%20Control%20Toys");
	String id ="container";
	driver.switchTo().window(id);
	WebElement ele = driver.findElement(By.xpath("//link[@data-chunk='NavMenu']"));
	ele.click();
}
}

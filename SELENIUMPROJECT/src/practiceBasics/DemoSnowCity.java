package practiceBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSnowCity {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://snowcityblr.com/");
	driver.findElement(By.linkText("Contact Us")).click();
	Thread.sleep(2000);
	driver.switchTo().frame(0);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@aria-label='Get directions to this location on Google Maps.']")).click();
}
}
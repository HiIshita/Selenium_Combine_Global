package practiceBasics;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.net.www.content.audio.x_aiff;

public class DemoTripoDeal {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.tripodeal.com/hotels");
	JavascriptExecutor js = (JavascriptExecutor) driver;
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//input[@placeholder='City or hotel name']")).sendKeys("TAJ");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@data-label='Check-In']")).click();
	WebElement startdate=	driver.findElement(By.id("mewtwo-datepicker-2023-6-29"));
	js.executeScript("arguments[0].click()", startdate);
	Thread.sleep(2000);
	WebElement web=	driver.findElement(By.xpath("//input[@data-label='Check-Out']"));
	js.executeScript("arguments[0].click()", web);
	Thread.sleep(2000);
	WebElement enddate = driver.findElement(By.xpath("//td[@id='mewtwo-datepicker-2023-7-25']"));
	js.executeScript("arguments[0].click()", enddate);
	Thread.sleep(2000);
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//a[@href='https://www.tripodeal.com/goa-packages']")).click();
}
}

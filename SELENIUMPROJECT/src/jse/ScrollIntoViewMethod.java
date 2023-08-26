package jse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoViewMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement element=	driver.findElement(By.id("vote-poll-1"));
	js.executeScript("arguments[0].scrollIntoView(true)", element);
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.linkText("Tricentis"));
	js.executeScript("arguments[0].scrollIntoView(true)", ele);
}
}

package jse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.java.swing.plaf.windows.resources.windows;

public class ScrollINtoViewMethodFalse {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement element = driver.findElement(By.linkText("News"));
	js.executeScript("arguments[0].scrollIntoView(false)", element);
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,-800)");
	Thread.sleep(2000);
	WebElement element1 = driver.findElement(By.linkText("Privacy Notice"));
	js.executeScript("arguments[0].scrollIntoView(false)", element1);
}
}

package jse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnteringDataByUsingJSE {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demowebshop.tricentis.com/");
	JavascriptExecutor js =(JavascriptExecutor) driver;
	WebElement element =driver.findElement(By.id("small-searchterms"));
	WebElement button = driver.findElement(By.xpath("//input[@type='submit']"));
	js.executeScript("arguments[0].value='selenium'", element);  //******entering one element to the search box******
	Thread.sleep(2000);
	js.executeScript("arguments[0].value=' '", element);  //*****reset the element by deleting it*****
	Thread.sleep(2000);
	js.executeScript("arguments[0].value='advance selenium'", element);  //**re-entering other element to the search box after reset**
	Thread.sleep(2000);
	js.executeScript("arguments[0].click()" ,button);  //*****click on the search button*****
	Thread.sleep(2000);
	js.executeScript("history.go()");	//*********refresh the page**********
}
}
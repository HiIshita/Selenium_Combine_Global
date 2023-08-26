package Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.softwaretestinghelp.com/");
	Actions act = new Actions(driver);
	act.contextClick().perform(); //it will right click on the page(left side top corner)
	
	Thread.sleep(2000);
	
	driver.get("http://omayo.blogspot.com/");
	WebElement web=	driver.findElement(By.id("blogsmenu"));
	act.contextClick(web).perform();  //it will right click on the selected element and then one context box will open..
	
}
}

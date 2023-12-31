	package Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://jqueryui.com/droppable/");
	Thread.sleep(2000);
	driver.switchTo().frame(0);
	WebElement src=	driver.findElement(By.id("draggable"));
	WebElement dest=driver.findElement(By.id("droppable"));
	Actions act = new Actions(driver);
	act.dragAndDrop(src, dest).perform();
}
}

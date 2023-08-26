//moving the element control from one element to another element:--

package Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementActionClass {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.myntra.com/");
	WebElement ele=	driver.findElement(By.linkText("MEN"));
	WebElement element=	driver.findElement(By.linkText("KIDS"));
	WebElement elements = driver.findElement(By.xpath("//a[@data-type='navElements']"));
	Actions act = new Actions(driver);
	act.moveToElement(ele).perform();
	Thread.sleep(2000);
	act.moveToElement(element).perform();
	Thread.sleep(2000);
	act.moveToElement(elements).perform();
}
}

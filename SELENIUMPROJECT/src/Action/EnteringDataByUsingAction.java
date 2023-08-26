//Entering Data by using Action Class:---

package Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EnteringDataByUsingAction {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demowebshop.tricentis.com/");
	WebElement ele = driver.findElement(By.xpath("//input[@value='Search']"));
	WebElement searchfield=	driver.findElement(By.id("small-searchterms"));
	Actions act = new Actions(driver);
	act.sendKeys(searchfield, "this is a test").click(ele).perform();
	Thread.sleep(2000);
    WebElement ele1= driver.findElement(By.id("newsletter-subscribe-button"));
	WebElement email=driver.findElement(By.id("newsletter-email"));
	act.sendKeys(email, "ishita").click(ele1).perform();

}
}

package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopUp {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.makemytrip.com/");
	WebElement departure = driver.findElement(By.xpath("//span[text()='Departure']"));
	((JavascriptExecutor)driver).executeScript("arguments[0].click()",departure);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@data-cy='handleSnackbarClose']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@aria-label=\"Sat Jul 22 2023\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()=\"Return\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@aria-label=\"Wed Aug 09 2023\"]")).click();
}
}

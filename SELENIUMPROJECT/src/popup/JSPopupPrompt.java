package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class JSPopupPrompt {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./SOFTWARESELENIUM/geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://only-testing-blog.blogspot.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[text()='Show Me Prompt']")).click();
	Alert alert = driver.switchTo().alert();
	Thread.sleep(2000);
	alert.sendKeys("ISHITA");
	Thread.sleep(2000);
	alert.accept();
}
}

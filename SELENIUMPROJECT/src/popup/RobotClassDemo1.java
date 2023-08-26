package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassDemo1 {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(2000);
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.name("q")).click();
	Robot robo = new Robot();
	robo.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	robo.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	robo.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	robo.keyRelease(KeyEvent.VK_ENTER);
}
}

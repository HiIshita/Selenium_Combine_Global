package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadByUsingRobotClass {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
	driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
	Thread.sleep(2000);
	Robot rb = new Robot();
	rb.keyPress(KeyEvent.VK_I);
	rb.keyRelease(KeyEvent.VK_I);
	rb.keyPress(KeyEvent.VK_N);
	rb.keyRelease(KeyEvent.VK_N);
	rb.keyPress(KeyEvent.VK_T);
	rb.keyRelease(KeyEvent.VK_T);
	rb.keyPress(KeyEvent.VK_E);
	rb.keyRelease(KeyEvent.VK_E);
	rb.keyPress(KeyEvent.VK_L);
	rb.keyRelease(KeyEvent.VK_L);
	
	
}
}
 
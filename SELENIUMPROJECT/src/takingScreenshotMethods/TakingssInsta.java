package takingScreenshotMethods;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingssInsta {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.instagram.com/accounts/login/");
	Thread.sleep(2000);
	TakesScreenshot ts = (TakesScreenshot) driver;
	WebElement ele = driver.findElement(By.xpath("//i[@aria-label='Instagram']"));
	File sista = ele.getScreenshotAs(OutputType.FILE);
	File dest = new File("./errorshot/sista.png");
	FileUtils.copyFile(sista, dest);
}
}

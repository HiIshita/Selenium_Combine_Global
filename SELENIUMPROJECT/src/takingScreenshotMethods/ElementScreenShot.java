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

public class ElementScreenShot {
	public static void main(String[] args) throws IOException {
		
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demowebshop.tricentis.com/");
	TakesScreenshot ts = (TakesScreenshot) driver;
	WebElement ele = driver.findElement(By.xpath("//input[@value='Search']"));
	File scr=ele.getScreenshotAs(OutputType.FILE);
	File dest = new File("./errorshot/ele.png");
	FileUtils.copyFile(scr,dest);
	
}
}
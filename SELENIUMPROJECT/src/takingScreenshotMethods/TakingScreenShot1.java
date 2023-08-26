package takingScreenshotMethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenShot1 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com/");
	TakesScreenshot ts = (TakesScreenshot) driver;
	File photo = ts.getScreenshotAs(OutputType.FILE);
	File dest =new File("./errorshot/ss.png");
    FileUtils.copyFile(photo, dest);
	}
}


package takingScreenshotMethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenShot2 {
public static void main(String[] args){
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys("hello!");
	driver.findElement(By.className("password")).sendKeys("world");
	TakesScreenshot ts = (TakesScreenshot) driver;
    File photo=	ts.getScreenshotAs(OutputType.FILE);
    File dest = new File("./errorshot/scrnshot.png");
    try {
		FileUtils.copyFile(photo, dest);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
}
}

package iframeRelatedConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeConceptUsingXpath {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.makemytrip.com/");
	WebElement element=	driver.findElement(By.xpath("//iframe[@name='notification-frame-173061b02']"));
	driver.switchTo().frame(element);
	driver.findElement(By.xpath("//img[@style='height: 590px; width: 900px;']")).click();
}
}

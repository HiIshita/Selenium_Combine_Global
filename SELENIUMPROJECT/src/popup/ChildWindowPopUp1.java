package popup;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopUp1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	driver.findElement(By.id("newWindowsBtn")).click();
	String parentid = driver.getWindowHandle();
	Set<String> allid = driver.getWindowHandles();
	allid.remove(parentid);
	String expectedTitle ="Basic Controls";
	for(String id : allid)
	{
		driver.switchTo().window(id);
		if(driver.getTitle().contains(expectedTitle))
		{
			driver.manage().window().maximize();
		}
		else {
			driver.close();	
		}
	}
}
}

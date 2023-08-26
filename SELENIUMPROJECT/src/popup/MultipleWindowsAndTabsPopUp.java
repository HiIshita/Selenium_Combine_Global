package popup;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsAndTabsPopUp {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	driver.findElement(By.id("newTabsWindowsBtn")).click();
	String parentid = driver.getWindowHandle();
	Set<String> allid = driver.getWindowHandles();
	allid.remove(parentid);
	String expectedTitle ="AlertsDemo";
	Thread.sleep(2000);
	for(String id : allid)
	{
		driver.switchTo().window(id);
		if(driver.getTitle().contains(expectedTitle))
		{
			System.out.println("done");
		}
		else
		{
			driver.close();
		}
}
}
}

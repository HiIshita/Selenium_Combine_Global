package testngExecutions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_6 {
	@Test(groups="SM")
	public void Launchinginstagram() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.close();
	}
}
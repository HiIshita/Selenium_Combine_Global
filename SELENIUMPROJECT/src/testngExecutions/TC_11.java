package testngExecutions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_11 {
	@Test
	@Parameters("Browser")
	public void Launchingmyntra(@Optional("hello!!") String abc) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		driver.close();
		System.out.println(abc);
	}
}
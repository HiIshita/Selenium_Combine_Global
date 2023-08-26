package testngExecutions;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_12 {
	@Test
	@Parameters("Browser")
	public void Launchingmyntra(String browser) throws InterruptedException
	{
		WebDriver driver;
		if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
		driver = new ChromeDriver();
		Reporter.log("chrome browser is lanunched",true);
	}
		else
		{
			System.setProperty("webdriver.edge.driver", "./SOFTWARESELENIUM/msedgedriver.exe");
			driver = new EdgeDriver();
			Reporter.log("edge browser is lanunched",true);
		}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Reporter.log("window is maximized");
	driver.get("https://www.myntra.com/");
	Reporter.log("navigate to myntra");
	Thread.sleep(2000);
	assertEquals(false, true);
	}
}
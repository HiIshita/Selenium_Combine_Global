package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUpHeadless {
public static void main(String[] args) {
	ChromeOptions opt = new ChromeOptions();
	opt.addArguments("--headless");
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	WebDriver driver = new ChromeDriver(opt);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.ajio.com/");
	driver.quit();
	System.out.println("headless mode");
}
}

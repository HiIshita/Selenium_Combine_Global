package practiceBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementGetWindowHandle {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.get("https://www.flipkart.com/");
	System.out.println(driver.getWindowHandle());
	System.out.println(driver.getWindowHandles());
}
}

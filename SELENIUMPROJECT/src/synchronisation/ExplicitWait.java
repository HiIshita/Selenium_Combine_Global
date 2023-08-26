package synchronisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver,10);
	driver.get("https://demowebshop.tricentis.com/");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log in")));
	WebElement ele = driver.findElement(By.linkText("Log in"));
	ele.click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Email")));
	//driver.close();
}
}

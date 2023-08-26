package select;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectValueIndexText {
public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("file:///C:/Users/ishit/OneDrive/Desktop/Dropdown.html");
	WebElement dropdown=driver.findElement(By.id("single"));
	Select select = new Select(dropdown);
	select.selectByIndex(1);
	Thread.sleep(2000);
	select.selectByValue("4");
	Thread.sleep(2000);
	select.selectByVisibleText("manual");
	System.out.println("**********************************************");
	System.out.println(select.getFirstSelectedOption().getText());
	System.out.println("**********************************************");
	//select.deselectByIndex(0);  ///de-select is only for multiple select, not for single select. so here it will throw an exception :manual.
}
}

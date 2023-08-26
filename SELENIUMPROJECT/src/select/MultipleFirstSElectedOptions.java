package select;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleFirstSElectedOptions {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("file:///C:/Users/ishit/OneDrive/Desktop/Dropdown.html");
	WebElement dropdown=driver.findElement(By.id("multiple"));
	Select select = new Select(dropdown);
	System.out.println(select.isMultiple());
	System.out.println("*****************************");
	
	select.selectByValue("2");
	Thread.sleep(2000);
	select.selectByVisibleText("manual");
	Thread.sleep(2000);
	select.selectByIndex(0);
	Thread.sleep(2000);
	System.out.println(select.getFirstSelectedOption().getText());//it will only take as per the drop down hierarchy..
	System.out.println("************************************");
	List<WebElement> allselect = select.getAllSelectedOptions();
	for(WebElement element:allselect)
{
	System.out.println(element.getText());
}
}
}

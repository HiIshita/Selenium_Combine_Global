package select;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


	public class SelectClassOptions {
	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("file:///C:/Users/ishit/OneDrive/Desktop/Dropdown.html");
	WebElement dropdown=driver.findElement(By.id("single"));
	Select select = new Select(dropdown);
	List<WebElement> allOptions = select.getOptions();
	for(WebElement element:allOptions)
	{
	System.out.println(element.getText());
	}
}
}
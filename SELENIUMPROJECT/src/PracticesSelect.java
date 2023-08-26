import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticesSelect {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("file:///C:/Users/ishit/OneDrive/Desktop/Dropdown.html");
	WebElement dropdown=driver.findElement(By.id("multiple"));
	Select select = new Select(dropdown);
	System.out.println(select.isMultiple());
	List<WebElement> alloption = select.getOptions();
	for(int i=0; i<=alloption.size(); i++)
	{
		select.selectByIndex(i);
	}
}
}
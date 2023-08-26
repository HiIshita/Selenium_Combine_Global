package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSPopupAcceptAndDismiss {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.findElement(By.xpath("//input[@value='Search']")).click();
	
	String ExpectedAlertMessage = "Please enter some search keyword";
	System.out.println(driver.switchTo().alert().getText());// To get the text from the popup window
	System.out.println("*****************");
	Thread.sleep(2000);
	Alert alt = driver.switchTo().alert();
	if(alt.getText().equals(ExpectedAlertMessage))
	{
		alt.accept(); //if the jspopup only consist of ok button then the accept() and the dismiss() are only click on the 'OK' button
	}
	driver.findElement(By.linkText("Log in")).click();
}
}

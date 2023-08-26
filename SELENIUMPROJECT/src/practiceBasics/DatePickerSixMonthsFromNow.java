///pick the date after six months/// or ///what is the date after six months!!///


package practiceBasics;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerSixMonthsFromNow {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://www.tripodeal.com/hotels");
	driver.switchTo().frame("tpcwl_iframe");
	driver.findElement(By.id("hotels-dates-checkin-prepop-whitelabel_en")).click();
	int month= LocalDateTime.now().plusMonths(6).getMonthValue();
	int date = LocalDateTime.now().plusMonths(6).getDayOfMonth();
	int year= LocalDateTime.now().plusMonths(6).getYear();
	for(;;)
	try
	{
		driver.findElement(By.id("mewtwo-datepicker-"+year+"-"+month+"-"+date+"")).click();
		break;
	}
	catch (NoSuchElementException e) {
	driver.findElement(By.xpath("//span[@role='datepicker-next']")).click();
	}	
}
}

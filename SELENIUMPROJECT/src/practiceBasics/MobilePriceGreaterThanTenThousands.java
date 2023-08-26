////Print the mobile price which is greater than 10000/- in amazon.com////

package practiceBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MobilePriceGreaterThanTenThousands {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.amazon.com");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile phones",Keys.ENTER);
	String price = driver.findElement(By.xpath("//span[@class='a-price-whole'][1]")).getText();
	System.out.println("Price of the first mobile in $ "+price);
	int value = Integer.parseInt(price);
	double val = value*81.75;
	System.out.println("Price of the first mobile in Rs." +val);
	System.out.println("*******************************************");
	
	List<WebElement> price1 = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	for(WebElement p : price1) {
		for(int i=1;i<price1.size();i++) {
    try
	{
		double allprice = Integer.parseInt(p.getText())*81.75;
		if(allprice>10000)
		System.out.println(allprice);
		System.out.println(driver.findElement(By.xpath("//span[@class='a-price-whole']/../../../../../../../../../preceding::span[@class='a-size-medium a-color-base a-text-normal']["+i+"]")).getText());
	}
	catch (Exception e) {
	}
}
}
}
}
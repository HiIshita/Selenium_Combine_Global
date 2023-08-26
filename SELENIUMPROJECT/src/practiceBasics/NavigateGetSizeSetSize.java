package practiceBasics;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class NavigateGetSizeSetSize {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	System.out.println(driver.manage().window().getSize().height);
	System.out.println(driver.manage().window().getSize().width);
	System.out.println(driver.manage().window().getPosition().x);
	System.out.println(driver.manage().window().getPosition().y);
	Thread.sleep(2000);
	Point p = new Point(23,32);
	driver.manage().window().setPosition(p);
	Thread.sleep(2000);
	Dimension d = new Dimension(1200,890);
	driver.manage().window().setSize(d);
}
}

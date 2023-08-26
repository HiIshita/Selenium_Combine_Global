package Basics;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;



public class GetAndSetPosition {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	ChromeDriver ref = new ChromeDriver();
	ref.get("https://www.amazon.com");
	System.out.println(ref.manage().window().getPosition());
	System.out.println(ref.manage().window().getPosition().x);
	System.out.println(ref.manage().window().getPosition().y);
	Thread.sleep(2000);
	Point d = new Point(23,32);
	ref.manage().window().setPosition(d);
}
}

package Basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndSetSize {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	ChromeDriver ref = new ChromeDriver();
	ref.get("https://www.amazon.com");
	
	System.out.println(ref.manage().window().getSize());
	System.out.println(ref.manage().window().getSize().height);
	System.out.println(ref.manage().window().getSize().width);
	Thread.sleep(2000);
	Dimension d = new Dimension(890, 650);
	ref.manage().window().setSize(d);
	
}
}

package Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	ChromeDriver ref = new ChromeDriver();
	ref.get("https://www.amazon.in");
	ref.manage().window().maximize();
	Thread.sleep(5000);
	ref.navigate().to("https://www.amazon.in/minitv?ref_=nav_avod_desktop_topnav");
	Thread.sleep(5000);
	ref.navigate().back();
	Thread.sleep(5000);
	ref.navigate().forward();
	Thread.sleep(5000);
	ref.navigate().refresh();
	Thread.sleep(4000);
	ref.close();	
}
}

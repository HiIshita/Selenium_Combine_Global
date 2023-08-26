package Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizingUsingManage {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	ChromeDriver ref = new ChromeDriver();
	ref.get("https://www.amazon.com");
	ref.manage().window().maximize();
	Thread.sleep(2000);
	ref.manage().window().fullscreen();
}
}

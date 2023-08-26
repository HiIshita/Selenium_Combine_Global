package Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public final class LaunchingAmazonApplication {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
		ChromeDriver ref = new ChromeDriver();
		ref.get("https://www.amazon.com");
		System.out.println("done");
		System.out.println(ref.getTitle());
	}
}

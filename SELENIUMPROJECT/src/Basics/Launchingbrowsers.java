package Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launchingbrowsers {
	
public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","./SOFTWARESELENIUM/chromedriver.exe");
	ChromeDriver a = new ChromeDriver();
}
}

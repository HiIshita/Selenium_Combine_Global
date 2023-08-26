package Basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingBrowserFirefox {
public static void main(String[] args) {
	
	System.setProperty("webdriver.gecko.driver", "./SOFTWARESELENIUM/geckodriver.exe");
	FirefoxDriver a = new FirefoxDriver();
}
}

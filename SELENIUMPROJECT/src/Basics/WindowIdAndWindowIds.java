package Basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetCurrentWindowHandle;

public class WindowIdAndWindowIds {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	ChromeDriver ref = new ChromeDriver();
	ref.get("https://www.google.com");
	
	System.out.println(ref.getWindowHandle());
	System.out.println(ref.getWindowHandles());
}
}

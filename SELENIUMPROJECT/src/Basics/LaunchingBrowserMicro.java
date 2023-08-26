package Basics;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchingBrowserMicro {
public static void main(String[] args) {
	
	System.setProperty("webdriver.edge.driver","./SOFTWARESELENIUM/msedgedriver.exe");
	EdgeDriver a1 = new EdgeDriver();
}
}
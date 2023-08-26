package Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingtheTitle {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	ChromeDriver ref = new ChromeDriver();
	ref.get("https://www.amazon.com");
	String Acceptedtitle = "Amazon.com. Spend less. Smile more.";
	String actualtitle= ref.getTitle();
	if(Acceptedtitle.equals(actualtitle))
	{
		System.out.println("testcase is passed");
	}
	else {
	System.out.println("testcase is failed");
}
}
}
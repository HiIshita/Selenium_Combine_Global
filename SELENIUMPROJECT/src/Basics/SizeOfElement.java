package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeOfElement {
public static void main(String[] args){
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement ref = driver.findElement(By.className("nivo-imageLink"));
	System.out.println("height is: "+ref.getSize().height);
	System.out.println("width is: "+ref.getSize().width);
	System.out.println("the x coordinate is: " +ref.getLocation().x);
	System.out.println("the y coordinate is:" +ref.getLocation().y);
	System.out.println("------------------------------------------");
}
}

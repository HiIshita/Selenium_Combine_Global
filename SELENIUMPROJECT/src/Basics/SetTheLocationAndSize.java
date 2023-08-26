package Basics;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import javafx.geometry.Side;

public class SetTheLocationAndSize {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./SOFTWARESELENIUM/chromedriver.exe");
	ChromeDriver ref = new ChromeDriver();
	ref.get("https://www.amazon.com");
    Point location = ref.manage().window().getPosition();
    System.out.println(location);
    System.out.println(location.x);
    System.out.println(location.y);
    Point position = new Point(200,250);
    Thread.sleep(2000);
    ref.manage().window().setPosition(position);
    Dimension size = ref.manage().window().getSize();
    System.out.println(size);
    System.out.println(size.height);
    System.out.println(size.width);
    Dimension d = new Dimension(380, 480);

    Thread.sleep(2000);
    ref.manage().window().setSize(d);
}
}

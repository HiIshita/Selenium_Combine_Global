package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorldClockPage {

	public WorldClockPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//img[@title='Show World Clock...']")
private WebElement ClockButton;

@FindBy(id="clockcity")
private WebElement ClockCityButton;

@FindBy(xpath = "//option[@value='6']")
private WebElement CButton;

public WebElement getClockButton() {
	return ClockButton;

}
public WebElement getClockCityButton() {
	return ClockCityButton;

}
public WebElement getCButton() {
	return CButton;

}
}

package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalandarPage {

	public CalandarPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Calendar")
	private WebElement CalPageButton;
	
	@FindBy(xpath="//img[@alt='Open Calendar...']")
	private WebElement OpenCalButton;
	
	public WebElement getCalPageButton()
	{
		return CalPageButton;
	}
	public WebElement getOpenCalButton()
	{
		return OpenCalButton;
	}

}

package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {


	public CalculatorPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@alt='Open Calculator...']")
	private WebElement OpenCalButton;
	
	@FindBy(name = "calc7")
	private WebElement SevenButton;
	
	@FindBy(name = "plus")
	private WebElement PlusButton;
	
	@FindBy(name = "calc9")
	private WebElement NineButton;
	
	@FindBy(name = "equal")
	private WebElement ResultButton;
	
	
	public WebElement getOpenCalButton() {
		return OpenCalButton;
	}
	
	public WebElement getSevenButton() {
		return SevenButton;
	}
	public WebElement getPlusButton() {
		return PlusButton;
	}
	public WebElement getNineButton() {
		return NineButton;
	}
	public WebElement getResultButton() {
		return ResultButton;
	}

}

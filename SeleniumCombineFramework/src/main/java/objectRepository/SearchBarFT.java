package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBarFT {

	public SearchBarFT(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "query_string")
	private WebElement query_stringButton;

	@FindBy(xpath = "//input[@alt='Find']")
	private WebElement FindIconButton;

	public WebElement getquery_stringButton() {
		return query_stringButton;
	}

	public WebElement getFindIconButton() {
		return FindIconButton;
	}
}

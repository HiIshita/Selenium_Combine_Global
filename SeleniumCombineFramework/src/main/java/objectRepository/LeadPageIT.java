package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadPageIT {
	public LeadPageIT(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Leads")
	private WebElement LeadsButton;

	@FindBy(xpath = "//a[@href='index.php?module=Leads&action=EditView&return_action=DetailView&parenttab=Marketing']")
	private WebElement CreateaLeadButton;

	@FindBy(xpath = "//select[@name='salutationtype']")
	private WebElement LeadsSalutationButton;

	@FindBy(xpath = "//option[@value='Mr.']")
	private WebElement MrButton;

	@FindBy(name = "firstname")
	private WebElement FirstTextButton;

	@FindBy(name = "lastname")
	private WebElement LastTextButton;

	@FindBy(name = "company")
	private WebElement CompanyButton;

	@FindBy(id = "phone")
	private WebElement MobButton;

	@FindBy(id = "email")
	private WebElement EmailButton;

	@FindBy(xpath = "//input[@value='U']")
	private WebElement RadioButton;

	@FindBy(xpath = "//input[@accesskey='S']")
	private WebElement SubButton;

	@FindBy(name = "website")
	private WebElement WebsiteButton;

	public WebElement getLeadsButton() {
		return LeadsButton;
	}

	public WebElement getcreatealeadButton() {
		return CreateaLeadButton;
	}

	public WebElement getLeadsSalutationButton() {
		return LeadsSalutationButton;
	}

	public WebElement getMrButton() {
		return MrButton;
	}

	public WebElement getFirstTextButton() {
		return FirstTextButton;
	}

	public WebElement getLastTextButton() {
		return LastTextButton;
	}

	public WebElement getCompanyButton() {
		return CompanyButton;
	}

	public WebElement getMobButton() {
		return MobButton;
	}

	public WebElement getRadioButton() {
		return RadioButton;
	}

	public WebElement getSubButton() {
		return SubButton;
	}

	public WebElement getEmailButton() {
		return EmailButton;
	}

	public WebElement getWebsiteButton() {
		return WebsiteButton;
	}
}

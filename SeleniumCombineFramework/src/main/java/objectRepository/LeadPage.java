package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadPage {

	public LeadPage(WebDriver driver) {
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

	@FindBy(name = "website")
	private WebElement WebsiteButton;

	@FindBy(xpath = "//input[@accesskey='S']")
	private WebElement SubButton;

	@FindBy(name = "search_text")
	private WebElement SearchLeadButton;

	@FindBy(id = "bas_searchfield")
	private WebElement SearchFieldLeadButton;

	@FindBy(xpath = "//option[@value = 'website']")
	private WebElement Website_NameLeadButton;

	@FindBy(name = "submit")
	private WebElement SubmitSearchLeadButton;

	@FindBy(id = "selectCurrentPageRec")
	private WebElement selectCurrentPageRecLeadButton;

	@FindBy(xpath = "//input[@value = 'Mass Edit']")
	private WebElement EditLeadButton;

	@FindBy(name = "website")
	private WebElement EditWebsiteNameLeadButton;

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

	public WebElement getSearchLeadButton() {
		return SearchLeadButton;
	}

	public WebElement getSearchFieldLeadButton() {
		return SearchFieldLeadButton;
	}

	public WebElement getWebsite_NameLeadButton() {
		return Website_NameLeadButton;
	}

	public WebElement getSubmitSearchLeadButton() {
		return SubmitSearchLeadButton;
	}

	public WebElement getselectCurrentPageRecLeadButton() {
		return selectCurrentPageRecLeadButton;
	}

	public WebElement getEditLeadButton() {
		return EditLeadButton;
	}

	public WebElement getEditWebsiteNameLeadButton() {
		return EditWebsiteNameLeadButton;
	}
}

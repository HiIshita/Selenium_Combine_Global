package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {

	public ContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Contacts")
	private WebElement ContactsButton;

	@FindBy(xpath = "//a[@href='index.php?module=Contacts&action=EditView&return_action=DetailView&parenttab=Marketing']")
	private WebElement CreateNewContactButton;

	@FindBy(xpath = "//select[@name='salutationtype']")
	private WebElement salutationtypeButton;

	@FindBy(xpath = "//option[@value='Mrs.']")
	private WebElement MrsButton;

	@FindBy(name = "firstname")
	private WebElement TextButton;

	@FindBy(name = "lastname")
	private WebElement LastButton;
	
	@FindBy(id = "title")
	private WebElement titleButton;

	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement SubmitButton;

	@FindBy(id = "email")
	private WebElement EmailButton;
	
	@FindBy(id = "phone")
	private WebElement PhButton;
	
	@FindBy(name = "search_text")
	private WebElement SearchButton;
	
	@FindBy(id = "bas_searchfield")
	private WebElement SearchFieldButton;

	@FindBy(xpath="//option[@value = 'firstname']")
	private WebElement First_NameButton;
	
	@FindBy(name = "submit")
	private WebElement SubmitSearchButton;
	
	@FindBy(id = "selectCurrentPageRec")
	private WebElement selectCurrentPageRecButton;
	
	@FindBy(xpath= "//input[@value = 'Mass Edit']")
	private WebElement EditButton;
	
	@FindBy(name= "firstname")
	private WebElement EditFirstNameButton;
	
	public WebElement getContactsButton() {
		return ContactsButton;
	}

	public WebElement getCreateNewContactButton() {
		return CreateNewContactButton;
	}

	public WebElement getSalutationTypeButton() {
		return salutationtypeButton;
	}

	public WebElement getMrsButton() {
		return MrsButton;
	}

	public WebElement getLastButton() {
		return LastButton;
	}

	public WebElement getTextButton() {
		return TextButton;
	}

	public WebElement getSubmitButton() {
		return SubmitButton;
	}
	public WebElement gettitleButton() {
		return titleButton;
	}
	public WebElement getEmailButton() {
		return EmailButton;
	}
	public WebElement getPhButton() {
		return PhButton;
	}
	public WebElement getSearchButton() {
		return SearchButton;
	}
	public WebElement getSearchFieldButton() {
		return SearchFieldButton;
	}
	public WebElement getFirst_NameButton() {
		return First_NameButton;
	}
	public WebElement getSubmitSearchButton() {
		return SubmitSearchButton;
	}
	public WebElement getselectCurrentPageRecButton() {
		return selectCurrentPageRecButton;
	}
	public WebElement getEditButton()
	{
		return EditButton;
	}
	public WebElement getEditFirstNameButton() {
		return EditFirstNameButton;
	}
}

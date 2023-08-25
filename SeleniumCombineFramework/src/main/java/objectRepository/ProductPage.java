package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	public ProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Products")
	private WebElement ProductsButton;

	@FindBy(xpath = "//a[@href='index.php?module=Products&action=EditView&return_action=DetailView&parenttab=Inventory']")
	private WebElement CreateProductButton;

	@FindBy(name = "productname")
	private WebElement ProductNameButton;

	@FindBy(id = "vendor_part_no")
	private WebElement VendorNumberButton;

	@FindBy(id = "productsheet")
	private WebElement PSheetButton;

	@FindBy(name = "website")
	private WebElement WebsiteButton;

	@FindBy(id = "serial_no")
	private WebElement serialnoButton;

	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement SubmitProductButton;

	@FindBy(id = "commissionrate")
	private WebElement commissionrateButton;

	@FindBy(id = "qtyinstock")
	private WebElement qtyinstockButton;

	@FindBy(id = "unit_price")
	private WebElement unit_priceButton;

	@FindBy(id = "qty_per_unit")
	private WebElement qty_per_unitButton;

	@FindBy(name = "search_text")
	private WebElement SearchProductButton;

	@FindBy(id = "bas_searchfield")
	private WebElement SearchFieldProductButton;

	@FindBy(xpath = "//option[@value = 'productname']")
	private WebElement ProductNameDropdownButton;

	@FindBy(name = "submit")
	private WebElement SubmitSearchProductButton;

	@FindBy(id = "selectCurrentPageRec")
	private WebElement selectCurrentPageRecProductButton;

	@FindBy(xpath = "//input[@value = 'Mass Edit']")
	private WebElement EditProductButton;

	@FindBy(name = "productname")
	private WebElement EditNameProductButton;

	public WebElement getProductsButton() {
		return ProductsButton;
	}

	public WebElement getCreateProductButton() {
		return CreateProductButton;
	}

	public WebElement getProductNameButton() {
		return ProductNameButton;
	}

	public WebElement getVendorNumberButton() {
		return VendorNumberButton;
	}

	public WebElement getPSheetButton() {
		return PSheetButton;
	}

	public WebElement getWebsiteButton() {
		return WebsiteButton;
	}

	public WebElement getSubmitProductButton() {
		return SubmitProductButton;
	}

	public WebElement getserialnoButton() {
		return serialnoButton;
	}

	public WebElement getcommissionrateButton() {
		return commissionrateButton;
	}

	public WebElement getqtyinstockButton() {
		return qtyinstockButton;
	}

	public WebElement getqty_per_unitButton() {
		return qty_per_unitButton;
	}

	public WebElement getunit_priceButton() {
		return unit_priceButton;
	}

	public WebElement getSearchProductButton() {
		return SearchProductButton;
	}

	public WebElement getSearchFieldProductButton() {
		return SearchFieldProductButton;
	}

	public WebElement getProductNameDropdownButton() {
		return ProductNameDropdownButton;
	}

	public WebElement getSubmitSearchProductButton() {
		return SubmitSearchProductButton;
	}

	public WebElement getselectCurrentPageRecProductButton() {
		return selectCurrentPageRecProductButton;
	}

	public WebElement getEditProductButton() {
		return EditProductButton;
	}

	public WebElement getEditNameProductButton() {
		return EditNameProductButton;
	}
}

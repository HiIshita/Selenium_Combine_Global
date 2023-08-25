package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPageIT {

	public ProductPageIT(WebDriver driver) {
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
}

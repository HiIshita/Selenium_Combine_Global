package Products;

import org.testng.annotations.Test;

import generics.Baseclass;

@Test
public class ST_PRODUCT_01_Test extends Baseclass {
	public void Logging_to_the_application_enter_products_details_with_valid_input_and_massedit_productname_of_product_details_then_logout() throws InterruptedException {
		product.getProductsButton().click();
		Thread.sleep(2000);
		product.getCreateProductButton().click();
		product.getProductNameButton().sendKeys("Bucket");
		product.getVendorNumberButton().sendKeys("787");
		product.getPSheetButton().sendKeys("sheet12");
		product.getWebsiteButton().sendKeys("www.buk.in");
		product.getserialnoButton().sendKeys("89");
		product.getcommissionrateButton().sendKeys("0.8");
		product.getqtyinstockButton().sendKeys("67");
		product.getqty_per_unitButton().sendKeys("55.55");
		product.getunit_priceButton().sendKeys("490");
		product.getSubmitProductButton().click();
		Thread.sleep(3000);
		product.getProductsButton().click();
		Thread.sleep(3000);
		product.getSearchProductButton().sendKeys("e");
		product.getSearchFieldProductButton().click();
		product.getProductNameDropdownButton().click();
		product.getSubmitSearchProductButton().click();
		product.getselectCurrentPageRecProductButton().click();
		product.getEditProductButton().click();
		product.getEditNameProductButton().sendKeys("java");
		product.getSubmitProductButton().click();
		product.getProductsButton().click();
		Thread.sleep(4000);
	}
}

package Products;

import org.testng.annotations.Test;

import generics.Baseclass;

public class IT_PRODUCT_01_Test extends Baseclass {
	@Test
	public void Creating_a_product_with_valid_details_and_able_to_see_the_added_product_details_in_product_page() throws InterruptedException 
	{
		productft.getProductsButton().click();
		productft.getCreateProductButton().click();
		productft.getProductNameButton().sendKeys("project");
		productft.getVendorNumberButton().sendKeys("606");
		productft.getPSheetButton().sendKeys("sheet0");
		productft.getWebsiteButton().sendKeys("www.adsel.in");
		productft.getserialnoButton().sendKeys("09");
		productft.getcommissionrateButton().sendKeys("6.51");
		productft.getqtyinstockButton().sendKeys("665");
		productft.getqty_per_unitButton().sendKeys("58.0");
		productft.getunit_priceButton().sendKeys("54.00");
		productft.getSubmitProductButton().click();
		Thread.sleep(3000);
		productft.getProductsButton().click();
		Thread.sleep(3000);
		
	}
}

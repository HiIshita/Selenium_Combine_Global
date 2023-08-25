package contacts;

import org.testng.annotations.Test;

import generics.Baseclass;

public class IT_CONTACTS_01_Test extends Baseclass {
	@Test
	public void Creating_a_contact_with_valid_details_and_able_to_see_the_added_details_in_contact_page() throws InterruptedException {

		contactft.getContactsButton().click();
		contactft.getCreateNewContactButton().click();
		contactft.getSalutationTypeButton().click();
		contactft.getMrsButton().click();
		contactft.getTextButton().sendKeys("Shila");
		contactft.getLastButton().sendKeys("Sharma");
		contactft.gettitleButton().sendKeys("Customer");
		contactft.getEmailButton().sendKeys("s72@gmail.com");
		contactft.getPhButton().sendKeys("5656787890");
		contactft.getSubmitButton().click();
		Thread.sleep(2000);
		contactft.getContactsButton().click();
		Thread.sleep(2000);
	}
}

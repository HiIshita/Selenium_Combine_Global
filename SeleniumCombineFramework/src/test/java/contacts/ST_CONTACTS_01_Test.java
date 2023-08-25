package contacts;

import org.testng.annotations.Test;

import generics.Baseclass;

public class ST_CONTACTS_01_Test extends Baseclass {
	@Test
	public void Logging_to_the_application_enter_contact_details_with_valid_input_and_massedit_firstname_of_contact_details_then_logout()
			throws InterruptedException {

		contact.getContactsButton().click();
		contact.getCreateNewContactButton().click();
		contact.getSalutationTypeButton().click();
		contact.getMrsButton().click();
		contact.getTextButton().sendKeys("Renna");
		contact.getLastButton().sendKeys("Banarjee");
		contact.gettitleButton().sendKeys("Admin");
		contact.getEmailButton().sendKeys("ria@gamil.com");
		contact.getPhButton().sendKeys("788757303");
		contact.getSubmitButton().click();
		contact.getContactsButton().click();
		Thread.sleep(2000);
		contact.getSearchButton().sendKeys("e");
		contact.getSearchFieldButton().click();
		contact.getFirst_NameButton().click();
		contact.getSubmitSearchButton().click();
		Thread.sleep(2000);
		contact.getselectCurrentPageRecButton().click();
		Thread.sleep(2000);
		contact.getEditButton().click();
		Thread.sleep(2000);
		contact.getEditFirstNameButton().sendKeys("Hello");
		contact.getSubmitButton().click();
		Thread.sleep(2000);
		contact.getContactsButton().click();
		Thread.sleep(5000);
	}
}

package leads;

import org.testng.annotations.Test;

import generics.Baseclass;

public class ST_LEADS_01_Test extends Baseclass {
	@Test
	public void Logging_to_the_application_enter_leads_details_with_valid_input_and_massedit_website_of_leads_details_then_logout()
			throws InterruptedException {

		lead.getLeadsButton().click();
		lead.getcreatealeadButton().click();
		lead.getLeadsSalutationButton().click();
		Thread.sleep(2000);
		lead.getMrButton().click();
		lead.getFirstTextButton().sendKeys("Rohan");
		lead.getLastTextButton().sendKeys("Sen");
		lead.getCompanyButton().sendKeys("XYZghj");
		lead.getMobButton().sendKeys("12345677860");
		lead.getEmailButton().sendKeys("aioc@gmail.com");
		lead.getWebsiteButton().sendKeys("rdatta.co.in");
		lead.getRadioButton().click();
		Thread.sleep(2000);
		lead.getSubButton().click();
		Thread.sleep(2000);
		lead.getLeadsButton().click();
		Thread.sleep(2000);
		lead.getSearchLeadButton().sendKeys("o");
		Thread.sleep(2000);
		lead.getSearchFieldLeadButton().click();
		Thread.sleep(2000);
		lead.getWebsite_NameLeadButton().click();
		Thread.sleep(2000);
		lead.getSubmitSearchLeadButton().click();
		Thread.sleep(2000);
		lead.getselectCurrentPageRecLeadButton().click();
		Thread.sleep(2000);
		lead.getEditLeadButton().click();
		Thread.sleep(2000);
		lead.getEditWebsiteNameLeadButton().sendKeys("hello.com");

		lead.getSubButton().click();

		lead.getLeadsButton().click();
		Thread.sleep(4000);

	}
}

package leads;

import org.testng.annotations.Test;

import generics.Baseclass;


public class IT_LEADS_01_Test extends Baseclass {

	@Test
	public void Creating_a_lead_with_valid_details_and_able_to_see_the_added_details_in_leads_page()throws InterruptedException {

		Thread.sleep(2000);
		leadft.getLeadsButton().click();
		leadft.getcreatealeadButton().click();
		leadft.getLeadsSalutationButton().click();
		Thread.sleep(2000);
		leadft.getMrButton().click();
		Thread.sleep(2000);
		leadft.getFirstTextButton().sendKeys("Sayantan");
		leadft.getLastTextButton().sendKeys("Datta");
		leadft.getCompanyButton().sendKeys("happyworld");
		leadft.getMobButton().sendKeys("12378945");
		leadft.getEmailButton().sendKeys("s@gmail.com");
		leadft.getWebsiteButton().sendKeys("web");
		Thread.sleep(2000);
		leadft.getRadioButton().click();
		Thread.sleep(2000);
		leadft.getSubButton().click();
		Thread.sleep(2000);
		leadft.getLeadsButton().click();
		Thread.sleep(2000);
	}
}

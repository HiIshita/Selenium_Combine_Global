package calandar;

import org.testng.annotations.Test;

import generics.Baseclass;

public class FT_CALANDAR_01_Test extends Baseclass {
@Test
	public void Verify_user_able_to_see_the_month_calandar_from_calandar_page() throws InterruptedException
	{
		calandar.getCalPageButton().click();
		Thread.sleep(2000);
		calandar.getOpenCalButton().click();
		Thread.sleep(5000);
	}
}

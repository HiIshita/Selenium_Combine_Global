package home;

import org.testng.annotations.Test;

import generics.Baseclass;

@Test
public class FT_CHANGE_TIME_01_Test extends Baseclass{

	public void Changing_the_time_as_per_country() throws InterruptedException
	{
	clock.getClockButton().click();
	Thread.sleep(2000);
	clock.getClockCityButton().click();
	Thread.sleep(2000);
	clock.getCButton().click();
	Thread.sleep(2000);
	}
}

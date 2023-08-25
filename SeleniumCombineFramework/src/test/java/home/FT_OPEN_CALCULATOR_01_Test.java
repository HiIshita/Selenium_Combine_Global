package home;

import org.testng.annotations.Test;

import generics.Baseclass;


public class FT_OPEN_CALCULATOR_01_Test extends Baseclass {
	@Test
public void Opening_calculator_from_home_page_and_performing_addition() throws InterruptedException
{
	calculatorft.getOpenCalButton().click();
	calculatorft.getSevenButton().click();
	Thread.sleep(2000);
	calculatorft.getPlusButton().click();
	Thread.sleep(2000);
	calculatorft.getNineButton().click();
	Thread.sleep(2000);
	calculatorft.getResultButton().click();
	Thread.sleep(2000);
}
}


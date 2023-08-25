package search;

import org.testng.annotations.Test;

import generics.Baseclass;

public class FT_SEARCH_BAR_02_Test extends Baseclass{
	@Test
	public void Error_message_display_by_entering_space_in_the_search_field_and_clicking_the_search_icon() throws InterruptedException 
	{
	search.getquery_stringButton().sendKeys("  ");
	Thread.sleep(2000);
	search.getFindIconButton().click();
	Thread.sleep(2000);
	}
}

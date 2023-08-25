package search;


import org.testng.annotations.Test;

import generics.Baseclass;


public class FT_SEARCH_BAR_01_Test extends Baseclass {
	@Test

	public void Search_working_by_adding_keyword_in_search_textfield_and_pressing_search_icon()throws InterruptedException {
		search.getquery_stringButton().sendKeys("datta");
		Thread.sleep(2000);
		search.getFindIconButton().click();
		Thread.sleep(2000);
	}
}

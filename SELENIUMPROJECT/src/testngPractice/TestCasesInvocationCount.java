package testngPractice;

import org.testng.annotations.Test;

public class TestCasesInvocationCount {
	@Test(invocationCount=700)
	public void deom()
	{
		System.out.println("Hell!! World");
	}
}

///Run the same test case for 'n' number of times///

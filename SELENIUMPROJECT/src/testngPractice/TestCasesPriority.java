package testngPractice;

import org.testng.annotations.Test;

public class TestCasesPriority {
	@Test(priority=1)
	public void login()
	{
		System.out.println("hey! I am in login");
	}
	@Test(priority=2)
	public void home()
	{
		System.out.println("hey! I am in home");
	}
	@Test(priority=3)
	public void logout()
	{
		System.out.println("hey! I am in logout");
	}
}


////notes: As we are given the priority, so it will give the output on the basis of priority////
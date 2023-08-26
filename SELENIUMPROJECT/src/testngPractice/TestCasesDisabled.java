package testngPractice;

import org.testng.annotations.Test;

public class TestCasesDisabled {
	@Test(priority = 1, enabled = false) //It is now disabled
	public void login()
	{
		System.out.println("hey! I am in login");
	}
	@Test(priority =2, enabled = true)  //It is enabled
	public void home()
	{
		System.out.println("hey! I am in home");
	}
	@Test(priority=3)  //It is enabled
	public void logout()
	{
		System.out.println("hey! I am in logout");
	}
}

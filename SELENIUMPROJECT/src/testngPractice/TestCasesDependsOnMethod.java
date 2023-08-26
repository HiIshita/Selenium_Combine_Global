package testngPractice;

import org.testng.annotations.Test;

public class TestCasesDependsOnMethod {
	@Test
	public void login()
	{
		System.out.println("hey! I am in login");
	}
	@Test(dependsOnMethods="login")
	public void home()
	{
		System.out.println("hey! I am in home");
	}
	@Test(dependsOnMethods= {"home","login"})
	public void logout()
	{
		System.out.println("hey! I am in logout");
	}
}

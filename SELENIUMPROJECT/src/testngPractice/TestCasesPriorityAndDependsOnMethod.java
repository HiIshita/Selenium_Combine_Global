package testngPractice;

import org.testng.annotations.Test;

public class TestCasesPriorityAndDependsOnMethod {
	@Test
	public void login()
	{
		System.out.println("hey! I am in login");
	}
	@Test(dependsOnMethods="login", priority = 1)
	public void home()
	{
		System.out.println("hey! I am in home");
	}
	@Test(dependsOnMethods= "home", priority=2)
	public void logout()
	{
		System.out.println("hey! I am in logout");
	}
}

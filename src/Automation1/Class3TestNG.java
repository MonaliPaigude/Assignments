package Automation1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;
import com.google.common.collect.ObjectArrays;

public class Class3TestNG {

	
	@Test(groups= {"Regression"})
	
	public void Homeloan()
	
	{
		System.out.println("Print HomeLoan");
	}
	
	@Test
	public void CarLoan()
	{
		System.out.println("Print CarLoan");
	}
	
	@Test(dependsOnMethods={"Loginloan","CarLoan"})
	public void Logoutloan()
	{
		System.out.println("Loan Logout");
	}
	
	@Test
	public void Loginloan()
	{
		System.out.println("Loan Login");
	}
	
	@Test(enabled=false)
	public void Demo()
	{
		System.out.println("Default Method");
	}
	
	@Test(dataProvider="getData")
	public void UserName(String name,String password)
	{
		System.out.println(name);
		System.out.println(password);
	}
	
	@DataProvider
	public ObjectArrays[][] getData()
	{
		Object[][] abc=new Object[2][2];
		abc[0][0]="username1";
		abc[0][1]="password1";
		
		abc[1][0]="username2";
		abc[1][1]="password2";
		return (ObjectArrays[][]) abc;
		
	}
}
	
	



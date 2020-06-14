package Automation1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class Class4TestNG {
	
	

	@AfterClass
	public void PersonalLoan()
	
	{
		System.out.println("Print Personal Loan");
	}
	
	@Test
	public void BikeLoan()
	{
		System.out.println("Print Bike Loan");
	}

	@Test
	public void Loan1()
	{
		System.out.println("Print Loan1");
	}
	
	@Test(groups= {"Regression"})
	public void Loan2()
	{
		System.out.println("Print Loan2");
	}
	@BeforeClass
	public void Loan3()
	{
		System.out.println("Print Loan3");
	}
	  
	
    
}

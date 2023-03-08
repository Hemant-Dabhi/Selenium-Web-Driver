import static org.testng.Assert.fail;

import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotation {
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("This is Befoer Suite");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("This is Before Class.");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("This is Before Test.");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("This is Before Method");
	}
	@Test
	public void test1()
	{
		System.out.println("Main Test Case1.");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Main Test Case2.");
		fail();
	}
	
	@Test
	public void test3()
	{
		System.out.println("MainTest Case3.");
		new SkipException("This is Skipped");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("This is After Method");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("This is After Test.");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("This is After Class");
	}

	@AfterSuite
	public void aftersuite()
	{
		System.out.println("This is After Suite");
	}
}

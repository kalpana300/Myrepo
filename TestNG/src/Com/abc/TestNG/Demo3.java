package Com.abc.TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Demo3{

	public WebDriver driver;
	@Test(priority=3)
	public void method_b()
	{
		System.out.println("executing b()") ;
	}	
	@Test(priority=1)
	public void method_c()
	{
		System.out.println("executing c()"); 
	}	
	@Test(priority=2)
	public void method_a()
	{
		System.out.println("executing a()") ;
	}	
}
package Com.abc.TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Demo2 {

	public WebDriver driver;
	@Test
	public void method_b()
	{
		System.out.println("executing b()") ;
	}	
	@Test
	public void method_c()
	{
		System.out.println("executing c()"); 
	}	
	@Test
	public void method_a()
	{
		System.out.println("executing a()") ;
	}	
}


package Com.abc.TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Demo4 {
public WebDriver driver;
@Test
public void method_a() 
{
	System.out.println("executing a()");
}
@Test
public void method_b()
{
  System.out.println("executing b()");
}
}

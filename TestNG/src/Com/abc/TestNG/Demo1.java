package Com.abc.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {

	public WebDriver driver;
	@BeforeMethod
	public void before()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void After() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
	@Test//Test_mehtod1
	public void google()
	{
		driver.get("http://www.google.com");
    }
  @Test//testmethod2
   public void facebook()
   {
	driver.get("http://www.facebook.com");
  }	
}


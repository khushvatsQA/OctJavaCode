package practiseTestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class DisableTC {

	@Test(enabled=false)
	public void testcase()throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.quit(); 
	}
	@Test(invocationCount =10)
	public void testcase1()throws InterruptedException
	{
		EdgeDriver driver=new EdgeDriver();
		Thread.sleep(3000);
		driver.quit(); 
		
	}
	
	
}

package practiseTestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleTestCases {           

	@Test(invocationCount =10)
	public void testcase()throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.quit(); 
		
	}
	

	
	
	
	
	
}

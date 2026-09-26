package practiseTestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ManyTestTimeout {

	@Test(timeOut=1000)//1sec
	public void testcase()throws InterruptedException
	{ChromeDriver driver=new ChromeDriver();
		driver.quit();
	
}
	
}
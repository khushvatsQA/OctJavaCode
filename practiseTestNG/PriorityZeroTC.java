package practiseTestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class PriorityZeroTC {
	@Test
	public void login()
	{
ChromeDriver driver=new ChromeDriver();
		driver.quit();	
	}
	@Test
public void logout()
	
	{
	ChromeDriver driver=new ChromeDriver();
	driver.quit();	
	}
	
	@Test(priority=-1)
	public void registration()
	
	{
		EdgeDriver driver=new EdgeDriver();
		driver.quit();	

	
	}
	//HERE ,it will run -1 then based on ASCII Value ,method will run
	
	
	
	
}

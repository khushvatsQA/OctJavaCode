package practiseTestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class PriorityTC {
	@Test(priority=0)
	public void login()
	{
ChromeDriver driver=new ChromeDriver();
		driver.quit();	
	}
	@Test(priority=1)
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
}//Execution will start from lower(-1,0,1)

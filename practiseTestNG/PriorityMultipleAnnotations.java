package practiseTestNG;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class PriorityMultipleAnnotations {
	@Test(priority=1,invocationCount=10)
public void logout()
	
{
	ChromeDriver driver=new ChromeDriver();
	driver.quit();	
	}
	@Test
	public void registration()
	
	{
		EdgeDriver driver=new EdgeDriver();
		driver.quit();	
	}
	//Total TC count=11,registration will run first

	
}

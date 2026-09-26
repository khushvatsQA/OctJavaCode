package practiseTestNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
public class BaseTestWithParameters {
	
	WebDriver driver;//Interface
	@Parameters("browser")
	@BeforeMethod
	public void launchBrowser(String nameOfBrowser)throws InterruptedException
	{
		if(nameOfBrowser.equals("chrome"))
		{
		driver=new ChromeDriver();	
		}
		if(nameOfBrowser.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		//ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
       @AfterMethod

public void quit()
{
	driver.quit();
}
	
	
	
}



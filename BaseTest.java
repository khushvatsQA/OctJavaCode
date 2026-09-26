package practiseTestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest 
{
	ChromeDriver driver;//make this global,we can utilize thoroughout class
	@BeforeMethod
	public void launchBrowser() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
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

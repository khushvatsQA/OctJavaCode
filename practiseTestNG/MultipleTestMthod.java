package practiseTestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class MultipleTestMthod {
	@Test//1sec
	public void chromeD()throws InterruptedException
	{  
		ChromeDriver driver=new ChromeDriver();
		driver.quit();
	
}//multiple test method ,then it will execute in alphabetically order based on ASCII
	@Test
	public void edgeD()throws InterruptedException
	{
		EdgeDriver driver=new EdgeDriver();
		driver.quit();	
}	
	
}

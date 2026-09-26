package practiseTestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class AmazonSigninAssert 
{  
	@Test
  public void m1() throws InterruptedException
  {
{
	//EdgeDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
	Thread.sleep(3000);
	////span[@id='nav-link-accountList-nav-line-1']
	WebElement dr=driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
	dr.click();
	Thread.sleep(3000);//By.xpath("//input[@type='email']"));
	WebElement dr1=driver.findElement(By.id("ap_email_login"));
	dr1.sendKeys("9027879935");
	WebElement dr2=driver.findElement(By.xpath("//input[@class='a-button-input']"));
	dr2.click();
	Thread.sleep(3000);
	WebElement dr3=driver.findElement(By.xpath("//input[@name='password']"));
	dr3.sendKeys("Shop@123");
	WebElement dr4=driver.findElement(By.id("signInSubmit"));
	dr4.click();
	/*WebElement dr5=driver.findElement(By.id("ap_password"));
	dr5.sendKeys("Shop@123");
	WebElement dr6=driver.findElement(By.id("signInSubmit"));
	dr6.click();	
*/
	
}
	
}
}
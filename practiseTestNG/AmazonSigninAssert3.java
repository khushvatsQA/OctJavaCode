package practiseTestNG;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class AmazonSigninAssert3 
{  
	@Test
  public void m2() throws InterruptedException
  {
{
	//EdgeDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
driver.get("https://www.amazon.in/");

	Thread.sleep(3000);
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
	
	/*  search product                                               */
	WebElement d=driver.findElement(By.id("twotabsearchtextbox"));
	d.sendKeys("toys");
	WebElement d1=driver.findElement(By.id("nav-search-submit-button"));
d1.click();
Thread.sleep(3000);
//click on image then navigate to anchor tag 
List<WebElement>list=driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
System.out.println(list.size());
list.get(0).click();
//child and parent window concept came
Set<String>s1=driver.getWindowHandles();
Iterator<String>pcid=s1.iterator();
String pid=pcid.next();
System.out.println(pid);
String cid=pcid.next();
driver.switchTo().window(cid);
Thread.sleep(3000);

WebElement addToCart=driver.findElement(By.id("add-to-cart-button"));
addToCart.click();
Thread.sleep(3000);
Assert.assertEquals(driver.findElement(By.name("proceedToRetailCheckout")).isDisplayed(), true);

}
	
}
}
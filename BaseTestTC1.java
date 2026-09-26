package practiseTestNG;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BaseTestTC1 extends BaseTest
{

@Test
	
	public void loginToAmazon() throws InterruptedException {
		
	
	Thread.sleep(3000);
	WebElement dr=driver.findElement(By.id("twotabsearchtextbox"));
	dr.sendKeys("Laptop");
	WebElement dr1=driver.findElement(By.id("nav-search-submit-button"));
dr1.click();
Thread.sleep(3000);
 
List<WebElement>list=driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
System.out.println(list.size());
list.get(0).click();

	}
}




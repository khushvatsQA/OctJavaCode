package practiseTestNG;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BTParametersTC2 extends BaseTestWithParameters
{
	@Test
	public void AddtoCart() throws InterruptedException {
		WebElement dr=driver.findElement(By.id("twotabsearchtextbox"));
		dr.sendKeys("toys");
		WebElement dr1=driver.findElement(By.id("nav-search-submit-button"));
	dr1.click();
	Thread.sleep(3000); 
	List<WebElement>list=driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
	System.out.println(list.size());
	list.get(0).click();
		Set<String>s1=driver.getWindowHandles();
		Iterator<String>pcid=s1.iterator();
		String pid=pcid.next();
		System.out.println(pid);
		
		String cid=pcid.next();
		driver.switchTo().window(cid);
		Thread.sleep(3000);
		WebElement addToCart=driver.findElement(By.id("add-to-cart-button"));
		addToCart.click();
			


}
}
/*Open amazon
search any product 
click on third product out of listof product
Add to Cart
*/
package automationSep;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AmazonAdd2Cart {
                            
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		WebElement dr=driver.findElement(By.id("twotabsearchtextbox"));
		dr.sendKeys("toys");
		WebElement dr1=driver.findElement(By.id("nav-search-submit-button"));
	dr1.click();
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
	//WebElement addToCart=driver.findElement(By.id("add-to-cart-button"));
	//addToCart.click();
	//Thread.sleep(3000);
		//input[@id='add-to-wishlist-button-submit']
	WebElement addToList=driver.findElement(By.xpath("//input[@id='add-to-wishlist-button-submit']"));
	addToList.click();
		

	}

}

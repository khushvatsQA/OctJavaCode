package automationSep;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLaptopAdd2Cart {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement dr=driver.findElement(By.id("twotabsearchtextbox"));
		dr.sendKeys("Laptop");
		WebElement dr1=driver.findElement(By.id("nav-search-submit-button"));
	dr1.click();
	Thread.sleep(3000);
	 
	List<WebElement>list=driver.findElements(By.xpath("//div[@data-component-type='s-search-result']//h2\r\n"));
	System.out.println(list.size());
	list.get(0).click();
	//child and parent window concept came
	Set<String>s1=driver.getWindowHandles();
	Iterator<String>pcid=s1.iterator();
	String pid=pcid.next();
	System.out.println(pid);
	
	String cid=pcid.next();
	driver.switchTo().window(cid);
	Thread.sleep(5000);
	
	WebElement addToCart=driver.findElement(By.id("add-to-cart-button"));
	addToCart.click();
		

	}

}

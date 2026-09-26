package automationSep;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart_Autosuggestion2 {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//Clickin on Application pop up cross icon
	
		WebElement popup=driver.findElement(By.xpath("//span[text()='✕']"));
		Thread.sleep(3000);
		popup.click();
		WebElement search=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		search.sendKeys("toys");
		Thread.sleep(3000);
		List<WebElement> autosugvalue=driver.findElements(By.xpath("//a[@class='ZBdLcw uOWdgt']"));
autosugvalue.get(1).click();
	
////a[@class='GnxRXv']
WebElement selectitem=driver.findElement(By.xpath("//a[@class='GnxRXv']"));
selectitem.click();
	}

}

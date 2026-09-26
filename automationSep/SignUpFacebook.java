package automationSep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpFacebook {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		System.out.println(driver.getTitle());
		driver.get("https://www.facebook.com/");
	        Thread.sleep(3000);       
	        WebElement dr=driver.findElement(By.xpath("//a[@aria-label='Create new account']"));       
		dr.click();
		//WebElement dr=driver.findElement(By.xpath("//a[@aria-label='Create new account']"));


	}

}

package automationSep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacaebookLogin {

	public static void main(String[] args) {        
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
		System.out.println(driver.getTitle());
		driver.get("https://www.facebook.com/");
		WebElement dr=driver.findElement(By.xpath("//input[@name='email']"));
		dr.sendKeys("khushvats@gmail.com");
		WebElement dr1=driver.findElement(By.xpath("//input[@name='pass']"));
		dr1.sendKeys("9027879935");
		WebElement dr2=driver.findElement(By.xpath("//div[@aria-label='Log in']"));
		dr2.click();
		driver.close();

		
	}

}

package automationSep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class AmazonSignIn {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();		
driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
WebElement dr=driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		dr.click();
		Thread.sleep(3000);
		//id="ap_email_login
		WebElement dr1=driver.findElement(By.id("ap_email_login"));
		dr1.sendKeys("9027879935");
		Thread.sleep(3000);
		WebElement dr2=driver.findElement(By.xpath("//input[@class='a-button-input']"));
		dr2.click();
		Thread.sleep(3000);
		WebElement dr3=driver.findElement(By.id("ap_password"));
		Thread.sleep(3000);
		dr3.sendKeys("Shop@123");
		WebElement dr4=driver.findElement(By.id("signInSubmit"));
		dr4.click();
		
		//driver.quit();
		
		
	}

}

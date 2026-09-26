package automationSep;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonAutosuggestion 
{
        public static void main(String[] args) throws InterruptedException 
        {
                ChromeDriver driver=new ChromeDriver();                
                        driver.get("https://www.amazon.in");
                //        driver.manage().window().maximize();   
                        Options o1=        driver.manage();
                        Window w1=        o1.window();
                        w1.maximize();
                        Thread.sleep(3000);
                WebElement e1=        driver.findElement(By.id("twotabsearchtextbox"));
                e1.sendKeys("shoe");
                Thread.sleep(3000);

                List<WebElement> list=driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
                
                list.get(0).click();
                
                
                
                
        }
}

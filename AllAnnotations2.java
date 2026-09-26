package practiseTestNG;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AllAnnotations2 {
  
  @BeforeMethod
  public void LaunchBrowser()
  {
	  System.out.println("LaunchBrowser" );
  }
  @AfterMethod
  public void quit()
  {
	  System.out.println("After Method");
  }
	
  @Test
  public void TestCase1()
  {
	  System.out.println("TestCase 1");
  }
	
  @Test
  public void TestCase2()
  {
	  System.out.println("TestCase 2");
  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

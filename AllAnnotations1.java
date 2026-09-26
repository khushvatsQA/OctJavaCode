package practiseTestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AllAnnotations1 {
  
  @BeforeClass
  public void before_Class()
  {
	  System.out.println("BeforeClass" );
  }
  @AfterTest
  public void after_Class()
  {
	  System.out.println("After class");
  }
	
  @Test
  public void TestCase()
  {
	  System.out.println("TestCase");
  }
	
  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

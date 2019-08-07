package selenium.selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

import selenium.alertbox;

@SuppressWarnings("unused")
public class alertboxTest extends alertbox {
	
//	alertbox a1 = new alertbox();
	
  @Test(priority=2)
  public void f1()
  {
	  
	  System.out.println("in f1"); 
	  //alert();
	  //Assert.assertEquals("hello", "helo");
	  
  }
  @Test(priority=1)
  public void f2()
  {
	  System.out.println("in f2");
	  //a1.alert();
  }

  
}

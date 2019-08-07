package selenium.selenium;

import org.testng.annotations.Test;

import selenium.methods;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class methodsTest extends methods{
	public WebDriver driver;

	@BeforeClass
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		driver=new ChromeDriver();
	}
	  
  @Test
  public void f() {
	  driver.get("http://demowebshop.tricentis.com");
	  String s = login(driver,"vaibahv@gmail.com","passss");  
	  System.out.println(s);
  }
  @Test
  public void f1() {
	  driver.get("http://demowebshop.tricentis.com");
	  login(driver,"arnav1509@gmail.com","p@ssword123");  
	  String s = login(driver,"vaibahv@gmail.com","passss");  
	  System.out.println(s);
  }
  @Test
  public void f2() {
	  driver.get("http://demowebshop.tricentis.com");
	  login(driver,"tahseen@gmail.com","pacdcssss"); 
	  String s = login(driver,"vaibahv@gmail.com","passss");  
	  System.out.println(s);
  }

  @AfterClass
  public void afterMethod() {
	  driver.quit();
//	  driver.close();
  }

}

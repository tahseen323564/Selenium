package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class accesselements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		System.setProperty("webdriver.chrome.driver","chromedriver_v75.exe");
		WebDriver dr = new ChromeDriver();
		
		dr.get("http://demowebshop.tricentis.com/login");
		
//		List<WebElement> rb = dr.findElements(By.name("sex"));
		
//		for(int i =0 ; i< 100; i++)
//		{
//			rb.get(i%3).click();
//		}
//		
//		rb.get(0).click();

		boolean cs = dr.findElement(By.name("RememberMe")).isSelected();
		boolean fs = false;
		
		while(true)
		{
			dr.findElement(By.name("RememberMe")).click();
		}
			
//		
//		if(fs!=cs)
//		{
//			dr.findElement(By.name("RememberMe")).click();
//		}
//		
//		
//		
		
	}

}

package july31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import selenium.methods;

@SuppressWarnings("unused")
public class mousehover {

	public static void main(String[] args) {
		
		methods met =new methods();
		String webadd = "http://demowebshop.tricentis.com/";
		
		met.print("hello");
		
		WebDriver dr = (WebDriver) met.webdriver(webadd);
		
		
		WebElement we1 = met.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a", dr);
				
		WebElement we2 = met.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/ul/li[3]/a", dr);
		
		
		Actions ac = new Actions(dr);
		Action set = ac.moveToElement(we1).build();
		set.perform();
		
		Action set1 = ac.moveToElement(we2).click().build();
		set1.perform();
		
		dr.close();
		
		

	}

}

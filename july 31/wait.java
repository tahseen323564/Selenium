package july31;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import selenium.methods;

public class wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		methods met = new methods();

		String webadd = "http://demowebshop.tricentis.com/";
		
		WebDriver dr = met.webdriver(webadd);
		
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		WebDriverWait wt = new WebDriverWait(dr,10);
//		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")));
		
		dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
		dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[1]/a")).click();
		//dr.close();
		while(true)
		{
			dr.navigate().back();
			dr.navigate().forward();
			//dr.navigate().refresh();
			//dr.navigate().to("http://demowebshop.tricentis.com/");
			//dr.navigate().to("https://www.facebook.com");
		}
		
		}

}

package july31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import selenium.methods;

public class Acttions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		methods met = new methods();

		String webadd = "http://demowebshop.tricentis.com/";
		
		WebDriver dr = met.webdriver(webadd);
		
		
		WebElement  we1 = dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
		WebDriverWait wt = new WebDriverWait(dr,10);
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")));
		
	}

}

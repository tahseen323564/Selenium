package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		System.setProperty("webdriver.chrome.driver","chromedriver_v75.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://www.w3schools.com/html/html_tables.asp");
	
		//dr.findElement(By.xpath(""));
		
		
		String st = dr.findElement(By.xpath("//*[contains(text(),'Create an account')]")).getText();
		dr.findElement(By.xpath("//*[@id=\"u_0_l\"]")).sendKeys("hello");
		
		dr.findElement(By.xpath("//*[@id=\"u_0_l\"]//following::input[1]")).sendKeys("hi");
		
		dr.findElement(By.xpath("//*[@id=\"u_0_l\"]")).clear();
		dr.findElement(By.xpath("//*[@id=\"u_0_l\"]")).sendKeys("hehe");
		
		
		dr.findElement(By.xpath("//*[@id=\"u_0_l\"]//following::input[2]")).sendKeys("9810977404");
		//dr.findElement(By.xpath("//[text() = 'Birthday']//ancestor::div[1]"));
		
		System.out.println(st);
		
		//*[contains(text();'Create an account')]
		//*[@id=\"content\"]/div/div/div/div/div[2]/div[1]/div[1]/span
		
//		dr.findElement(By.id("email")).sendKeys("girishindia95@gmail.com");
//		dr.findElement(By.id("pass")).sendKeys("newfbp@555");
//		dr.findElement(By.id("loginbutton")).click();
//		
//		String profile_name, title = dr.getTitle();
		//profile_name = dr.findElement(By.xpath("//*[@id=\"u_0_a\"]/div[1]/div[1]/div/a/span/span")).getText();
		//System.out.println(profile_name);
		
		
		System.out.println("hello ");
	
		
	}

}

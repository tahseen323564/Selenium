package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver_v75.exe");
		WebDriver dr = new ChromeDriver();
		
		dr.get("http://demowebshop.tricentis.com");
		String title = dr.getTitle();
		dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
		
		dr.findElement(By.xpath("//*[@id=\"gender-male\"]")).click();
		dr.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("tahseen anwar");
		dr.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("tahir");
		dr.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("tahseen@global.com");
		dr.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("tahseen1");
		dr.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("tahseen1");
		
		dr.findElement(By.xpath(""));
		
//		dr.findElement(By.xpath(""));
		
		
		String title1 = dr.getTitle();
		
		boolean a = title.equals(title1);
		System.out.println(a);
		
	}

}

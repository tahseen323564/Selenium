package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertbox {

	public static void main(String[] args) {
		alertbox ab = new alertbox();
		ab.alert();
		
	}
	public void alert()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
//		driver.get("http://demo.guru99.com//test/delete_customer.php");
//		driver.findElement(By.name("cusid")).click();
//		driver.findElement(By.name("cusid")).sendKeys("1234");
//		driver.findElement(By.name("submit")).click();
//		String a = driver.switchTo().alert().getText();	
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
//		System.out.println(a);
//		driver.close();
	}

}

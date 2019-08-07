package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tablexpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver_v75.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://www.w3schools.com/html/html_tables.asp");
		for(int i =1;i<4;i++)
		{
			for(int j=1;j<4;j++)
			{
				@SuppressWarnings("unused")
				String xp = "//*[@";
			}
			
		}
		
	}
	
}

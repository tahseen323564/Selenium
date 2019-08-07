package aug5;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fdmethod {
	String kw;
	String xp;
	String td;
	boolean tr;
	public WebDriver browser(String url)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		WebDriver dr=new ChromeDriver();	
		dr.get(url);
		return dr;
	}
	public void enter_txt(String xp, String td,WebDriver dr)
	{
		dr.findElement(By.xpath(xp)).sendKeys(td);
	}
	public void click(String xp,WebDriver dr)
	{
		dr.findElement(By.xpath(xp)).click();
	}
	public boolean verify(String xp,String ar,WebDriver dr)
	{
		String s=dr.findElement(By.xpath(xp)).getText();
		if(s.equals(ar))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}


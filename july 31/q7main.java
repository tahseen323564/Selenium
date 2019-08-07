package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class q7main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		WebDriver dr=new ChromeDriver();

		methods met =new methods();
		String file_path="D://shoppingcart.xlsx";
		
		dr.get("http://examples.codecharge.com/Store/Default.php");
		String s=dr.getTitle();
		String s1="Online Bookstore"; 
		if(s.contentEquals(s1))
		{
			System.out.println("Ture");
		}
		else
		{
			System.out.println("False");
		}
		
		
		dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/form/table[2]/tbody/tr[1]/td/select/option[3]")).click();
		dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/form/table[2]/tbody/tr[3]/td/input")).click();
		dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/table[2]/tbody/tr[1]/td[2]/b/a")).click();
		dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/form/form/p[1]/input")).clear();
		dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/form/form/p[1]/input")).sendKeys("1");
		dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/form/form/p[2]/input[1]")).click();
		dr.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/a[1]")).click();
		dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/form/table[2]/tbody/tr[1]/td/select/option[3]")).click();
		dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/form/table[2]/tbody/tr[3]/td/input")).click();
		dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/table[2]/tbody/tr[3]/td[2]/b/a")).click();
		dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/form/form/p[1]/input")).clear();
		dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/form/form/p[1]/input")).sendKeys("2");
		dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/form/form/p[2]/input[1]")).click();

		
		
//		html/body/table[5]/tbody/tr/td/table/tbody/tr/td/form[1]/table[2]/tbody/tr[2]/td[1]
		
		for(int i=2;i<4;i++)
		{
			for(int j=1;j <4;j++)
			{
				String xp = "html/body/table[5]/tbody/tr/td/table/tbody/tr/td/form[1]/table[2]/tbody/tr["+i+"]/td["+j+"]";
				String data = dr.findElement(By.xpath(xp)).getText();
				System.out.println(data);
			}
		}
		
		//dr.close();
		

	}

}


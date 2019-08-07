package selenium;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class q4_excel_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<q4class> ar = new ArrayList<q4class>();
		
		String email;
		String pass;
		String expec_result;
		String file_path = "D:\\logintestcase.xlsx";
		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("http://demowebshop.tricentis.com/");
		
		methods met = new methods();
		
		
		
		for(int i=1;i<4;i++)
		{
				email = met.read(i, 0, file_path );
				pass = met.read(i, 1, file_path);
				expec_result = met.read(i, 2, file_path);
				q4class o = new q4class(email,pass,expec_result);
				System.out.println(o.email + o.pass);
				ar.add(o);
		}
		
		
		int counter=1;
		for(q4class i: ar)
		{
			dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
			dr.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(i.email);
			//System.out.println(i.email + i.pass);
			dr.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(i.pass);
			
			dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
			
			String data = dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).getText();
			if(i.expec_result == data)
			{
				met.write(counter, 3, file_path, "login successful");
			}
			else
			{
				met.write(counter, 3, file_path, "login failed");
			}
			counter++;
			dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		}
		
		dr.close();
		

	}

}

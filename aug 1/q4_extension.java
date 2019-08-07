package selenium;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class q4_extension {

	public static void main(String[] args) {
		

		ArrayList<q4class> ar = new ArrayList<q4class>();
		
		String email;
		String pass;
		String expec_result;
		String file_path = "D:\\logintestcase.xlsx";
		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("http://demowebshop.tricentis.com/");
		
		
		
		methods met = new methods();
		
		
		
		for(int i=1;i<6;i++)
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
			String err ="";
			dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
			dr.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(i.email);
			String g=null;
			try
			{
				g= dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[2]/span")).getText();
				err+=g;
			}
			catch(Exception e)
			{
				
			}
			System.out.println(i.email + "  " + i.pass);
			dr.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(i.pass);
			
			dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
			
			String data = dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).getText();
			if(data.equals("Register"))
			{
				
				String d=null;
				String e=null;
				String f=null;

					try {
						d = dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div/span")).getText();
						err+=d;
					} catch (Exception e1) {
						//e1.printStackTrace();
					}
					try {
						e = dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div/ul/li")).getText();
//						met.write(counter, 3, file_path, e );
						err+=e;
						
					} catch (Exception e1) {
						//e1.printStackTrace();
					}
					try {
						f = dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[2]/span/span")).getText();
//						met.write(counter, 3, file_path, f);
						err+=f;
					} catch (Exception e1) {
						//e1.printStackTrace();
					}
			
					met.write(counter, 3, file_path, err);
					
				dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
			}
			else
			{
				met.write(counter, 3, file_path, "Login successful");
				err = "Login successful";
				
			}
			
			dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
			
			if(i.expec_result.equals(err))
			{
				met.write(counter, 4, file_path, "Test case passed");
			}
			else
			{
				met.write(counter, 4, file_path, "Test case failed");
			}
			counter++;
		}
		dr.close();
		
	}

}

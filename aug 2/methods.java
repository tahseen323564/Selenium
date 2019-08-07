package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class methods {

	public WebDriver webdriver(String siteadd)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		WebDriver dr=new ChromeDriver();
		dr.get(siteadd);
		return dr;
	}
	
	@SuppressWarnings("resource")
	
	public String read(int x, int y ,String file_path )
	{
		String result=null;
		try
		{
			File f = new File(file_path);
			FileInputStream  fis = new FileInputStream(f);
			XSSFWorkbook wb =  new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheet("Sheet1");
			XSSFRow row = sh.getRow(x);
			XSSFCell cell = row.getCell(y);
			//System.out.println("hi ");
			result = cell.getStringCellValue();
			
//			result = (int)cell.getNumericCellValue();

		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("not reading");
		}
		
		return result;
	
	}
	
	public void write(int x, int y, String file_path, String data )
	//public boolean write(int x, int y, String str, String data )
	{
		//boolean flag=false;
		try
		{
			//File f = new File("D:\\FirstSheet.xlsx");
			File f = new File(file_path);
			FileInputStream  fis = new FileInputStream(f);
			@SuppressWarnings("resource")
			XSSFWorkbook wb =  new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheet("Sheet1");
			XSSFRow row1 = sh.getRow(x);
			XSSFCell celld = row1.getCell(y);
			//System.out.println("hi ");
			
			celld.setCellValue(data);
			FileOutputStream fos=new FileOutputStream(f);
			wb.write(fos);
			//flag = true;
		}
		catch(Exception e)
		{
			System.out.println(e);
			//flag = false;
		}
		
		//return flag;
	}
	
	public String login(WebDriver driver, String email, String pass)
	{
		String err ="";
		String g=null;
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(email);
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(pass);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		try
		{
			g= driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[2]/span")).getText();
			err+=g;
		}
		catch(Exception e){}
		try {
			g = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div/span")).getText();
			err+=g;
		} catch (Exception e1) {}
		try {
			g = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div/ul/li")).getText();
			
			err+=g;
			
		} catch (Exception e1) {}
		try {
			g = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[2]/span/span")).getText();
			err+=g;
		} catch (Exception e1) {}
		
		return err;
	}
	

	
}
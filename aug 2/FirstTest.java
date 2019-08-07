package selenium.selenium;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class FirstTest {
private WebDriver driver;
@SuppressWarnings("unused")
private Map<String, Object> vars;
JavascriptExecutor js;
@BeforeMethod
public void setUp() {
 driver = new FirefoxDriver();
 js = (JavascriptExecutor) driver;
 vars = new HashMap<String, Object>();
}
@AfterMethod
public void tearDown() {
 driver.quit();
}
@Test
public void first() {
 driver.get("http://demowebshop.tricentis.com/");
 driver.manage().window().setSize(new Dimension(1382, 784));
 driver.findElement(By.linkText("Log in")).click();
 driver.findElement(By.linkText("Register")).click();
 driver.findElement(By.id("gender-male")).click();
 driver.findElement(By.id("FirstName")).click();
 driver.findElement(By.id("FirstName")).click();
 driver.findElement(By.id("FirstName")).sendKeys("tahseen");
 driver.findElement(By.id("LastName")).sendKeys("anwar");
 driver.findElement(By.id("Email")).sendKeys("tahir@gmail.com");
 driver.findElement(By.id("Password")).sendKeys("123");
 driver.findElement(By.id("ConfirmPassword")).sendKeys("123");
 driver.findElement(By.id("register-button")).click();
 driver.findElement(By.id("Password")).sendKeys("123456");
 driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
 driver.findElement(By.id("register-button")).click();
// driver.findElement(By.cssSelector(".register-continue-button")).click();
// driver.findElement(By.linkText("Log out")).click();
}
}

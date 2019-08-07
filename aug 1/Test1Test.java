package selenium;

// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
public class Test1Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;

  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void test1() {
    driver.get("http://demowebshop.tricentis.com/");
    driver.manage().window().setSize(new Dimension(1382, 784));
    {
      WebElement element = driver.findElement(By.cssSelector(".header-logo img"));
      Action builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.linkText("Books")).click();
    driver.findElement(By.cssSelector(".item-box:nth-child(1) .picture > a")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".email-a-friend-button"));
      Action builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.id("addtocart_13_EnteredQuantity")).click();
    driver.findElement(By.id("addtocart_13_EnteredQuantity")).sendKeys("4");
    driver.findElement(By.id("add-to-cart-button-13")).click();
    driver.findElement(By.linkText("Cell phones")).click();
    driver.findElement(By.cssSelector(".item-box:nth-child(2) .button-2")).click();
    driver.findElement(By.cssSelector(".add-info:nth-child(3) .button-2")).click();
    driver.findElement(By.cssSelector(".top-menu > li:nth-child(6)")).click();
    driver.findElement(By.cssSelector(".hover")).click();
    driver.findElement(By.cssSelector(".item-box:nth-child(3) .picture > a")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".addthis_button_expanded"));
      Action builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Action builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".addthis_button_expanded"));
      Action builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".at-icon-addthis"));
      Action builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.cssSelector(".addthis_toolbox")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".at-icon-addthis"));
      Action builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Action builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector(".also-purchased-products-grid > .item-box:nth-child(4) img")).click();
    driver.findElement(By.cssSelector(".add-to-compare-list-button")).click();
    driver.findElement(By.linkText("Tricentis")).click();
  }
}
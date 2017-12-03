import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void TFS_01() {
	  String baseUrl = "http://demo.guru99.com/selenium/newtours/";					
      System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Selenium\\eclipse-java-neon\\chromedriver_win32\\chromedriver.exe");					
      WebDriver driver = new ChromeDriver();					
      		
      driver.get(baseUrl);	
      WebElement e1 = driver.findElement(By.cssSelector("form[name=home]"));
      e1 = driver.findElement(By.cssSelector("form[name=home]"));
      WebElement e2 = e1.findElement(By.cssSelector("input[name^=use"));
      e2.sendKeys("Abc");
      //driver.findElement(By.cssSelector("input[name*=userNa]"))"font[value=User Name:] + input[name*=userNa]"
      //driver.findElement(By.name("btnK")).click();
      
      System.out.println("title of page is: " + e2.getAttribute("value"));	
  assertEquals(true, true);
  }
}

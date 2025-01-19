package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scenario1 
{
  @Test
  public void scenario()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  LoginPage lp = new LoginPage(driver);
	  WebElement element=lp.getUntbx();
	  driver.navigate().refresh();
	  element.sendKeys("abc@gmail.com");
	  driver.close();
  }
}

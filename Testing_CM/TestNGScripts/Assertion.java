package TestNGScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion 
{
 @Test
 public void assertion()
 {
	 WebDriver driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/");
	 String expected = "Facebook";
	 String actual = driver.getTitle();
	 SoftAssert s=new SoftAssert();
	 s.assertEquals(actual, expected);
	 driver.close();
	 s.assertAll();
 }
}

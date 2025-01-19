package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetcssValue_method //To css value of particular element
{

	public static void main(String[] args)
	{
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.facebook.com/");
      String value=driver.findElement(By.xpath("//img[@alt='Facebook']")).getCssValue("height");
      System.out.println(value);
      driver.close();
	}

}

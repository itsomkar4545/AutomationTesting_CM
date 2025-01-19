package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getattribute_Method //To get attribute of particular value
{

	public static void main(String[] args) throws InterruptedException 
	{
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.facebook.com/");
      String value=driver.findElement(By.xpath("//img[@alt='Facebook']")).getAttribute("src");
      System.out.println(value);
      Thread.sleep(5000);
      driver.close();
      
	}

}

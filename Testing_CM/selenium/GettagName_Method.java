package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettagName_Method //To get tag name
{

	public static void main(String[] args) throws InterruptedException 
	{
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.instagram.com/");
      Thread.sleep(5000);
      String tag=driver.findElement(By.name("username")).getTagName();
      System.out.println(tag);
      Thread.sleep(3000);
      driver.close();
	}

}

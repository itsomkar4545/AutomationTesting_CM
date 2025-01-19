package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_Method {

	public static void main(String[] args) throws InterruptedException 
	{
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.flipkart.com/");
      Thread.sleep(4000);
  List<WebElement>alllinks=driver.findElements(By.xpath("//a"));
      int count=alllinks.size();
      System.out.println(count);
      for (int i = 0; i < count; i++) 
      {
		String link=alllinks.get(i).getText();
		System.out.println(link);
	  }
      Thread.sleep(3000);
      driver.close();   
	}

}

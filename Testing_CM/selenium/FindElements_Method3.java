package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_Method3 {

	public static void main(String[] args) throws InterruptedException 
	{
      WebDriver driver =new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.amazon.in/");
      driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15");
      Thread.sleep(5000);
      List<WebElement>allauto=driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
      int count=allauto.size();
      System.out.println(count);
      for (int i = 0; i < count; i++) 
      {
    	String text=allauto.get(i).getText();
		System.out.println(text);
	  }
      Thread.sleep(5000);
      driver.close();
	}

}

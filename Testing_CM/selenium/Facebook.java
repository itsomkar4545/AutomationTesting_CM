package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException 
	{
      ChromeDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("file:///C:/Users/02abh/OneDrive/Desktop/text2.html");
      WebElement element =driver.findElement(By.name("facebook"));
      element.click();
      Thread.sleep(5000);
      driver.close();
     
     
     
      
	}

}

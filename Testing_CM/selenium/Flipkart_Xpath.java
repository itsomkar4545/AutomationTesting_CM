package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Xpath {

	public static void main(String[] args) 
	{
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.flipkart.com/");
      driver.findElement(By.name("q")).sendKeys("iphone 15 pro");
      driver.findElement(By.xpath("//button[@type='submit']")).click();
      String price=driver.findElement(By.xpath("//div[text()='Apple iPhone 15 Pro (Natural Titanium, 256 GB)']/../../../div[2]/div[2]/div[1]/div[1]")).getText();
	  System.out.println(price);
	  driver.close();
	}

}

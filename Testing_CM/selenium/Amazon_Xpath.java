package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Xpath {

	public static void main(String[] args) 
	{
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.amazon.in/");
      driver.findElement(By.id("twotabsearchtextbox")).sendKeys("pixel 9 pro");
      driver.findElement(By.id("nav-search-submit-button")).click();
      String price=driver.findElement(By.xpath("//span[text()='Pixel 9 Pro XL 5G (Obsidian, 16 RAM, 128GB Storage)']/../../../../div[3]/div[1]/div/div[1]/div/div[1]/a/span[1]/span[2]")).getText();
	  System.out.println(price);
	  driver.close();	
	  
	}

}

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getsize_Method //To get size of particular element
{

	public static void main(String[] args) 
	{
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.cricbuzz.com/");
     int height=driver.findElement(By.linkText("Confident Shami backs India to complete hat-trick Down Under")).getSize().getHeight();
     int width=driver.findElement(By.linkText("Confident Shami backs India to complete hat-trick Down Under")).getSize().getWidth();
      System.out.println("Height: "+height);
      System.out.println("Width: "+width);
      driver.close();
	}

}

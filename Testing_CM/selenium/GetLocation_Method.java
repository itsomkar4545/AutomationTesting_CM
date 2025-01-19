package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation_Method //To find location x & y axis
{

		public static void main(String[] args) 
		{
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.cricbuzz.com/");
         int x=driver.findElement(By.linkText("Confident Shami backs India to complete hat-trick Down Under")).getLocation().getX();
	     int y=driver.findElement(By.linkText("Confident Shami backs India to complete hat-trick Down Under")).getLocation().getY();
	      System.out.println("X Loction: "+x);
	      System.out.println("Y Location: "+y);
	      driver.close();
		}

}

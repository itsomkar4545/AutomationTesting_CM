package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_Method {

	public static void main(String[] args) throws InterruptedException 
	{
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.facebook.com/");
     driver.findElement(By.id("email")).sendKeys("njdneincneiac");
     Thread.sleep(5000);
     driver.findElement(By.id("email")).clear();
     Thread.sleep(5000);
     driver.close();
     
	}

}

package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdobeHome {

	public static void main(String[] args) 
	{
		
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      
      driver.get("https://www.adobe.com/");
      driver.findElement(By.xpath("//button[@class='dialog-close']")).click();
      driver.findElement(By.xpath("//button[.='Sign in']")).click();
      driver.findElement(By.linkText("Continue with Google")).click();
	}

}

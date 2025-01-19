package Handling_Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nestedwith_Multiple {

	public static void main(String[] args) throws InterruptedException
	{
		   WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	       driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	       driver.findElement(By.xpath("//section[.='Frames']")).click();
	       driver.findElement(By.xpath("//section[.='iframes']")).click();
	       driver.findElement(By.linkText("Nested with Multiple iframe")).click();
	       Thread.sleep(4000);
	       driver.switchTo().frame(0);//first child frame
	       driver.switchTo().frame(0);//2nd child frame
	       driver.switchTo().frame(0);//3rd child 
	       driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	       driver.switchTo().parentFrame();//back to parent frame(first child frame)
	       driver.switchTo().frame(1);//2nd child of 3rd child
	       driver.findElement(By.id("password")).sendKeys("abcdefg");
	       driver.switchTo().defaultContent();//very first child
	       Thread.sleep(4000);
	       driver.findElement(By.linkText("Multiple iframe")).click();
	       Thread.sleep(4000);
	       
	       driver.close();
	}

}

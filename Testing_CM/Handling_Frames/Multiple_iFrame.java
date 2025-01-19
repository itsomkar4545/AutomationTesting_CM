package Handling_Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_iFrame {

	public static void main(String[] args) throws InterruptedException
	{
		   WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	       driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	       driver.findElement(By.xpath("//section[.='Frames']")).click();
	       driver.findElement(By.xpath("//section[.='iframes']")).click();
	       driver.findElement(By.linkText("Multiple iframe")).click();
	       Thread.sleep(4000);
	       
	       driver.switchTo().frame(0);//to go child frame
	       driver.findElement(By.id("email")).sendKeys("sdtsvs@gmail.com");
	       driver.switchTo().parentFrame();//back to parent frame
	       driver.switchTo().frame(1);//to go second child
	       driver.findElement(By.id("username")).sendKeys("abc@gmail.com");
	       driver.switchTo().parentFrame();//back to the parent frame
	       
	       Thread.sleep(4000);
	       driver.close();
	}

}

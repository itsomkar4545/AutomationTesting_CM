package Pop_up;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[.='Popups']")).click();
		driver.findElement(By.xpath("//section[.='Browser Windows']")).click();
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.xpath("//button[.='Click to open multiple popup windows']")).click();
		
	    String parentWindow = driver.getWindowHandle();//To control the parent window
	    
		Set<String> allwinid = driver.getWindowHandles();//to handle the child windows
		
		for (String win : allwinid)  
		{
			if (!win.equals(parentWindow))//Parent window is not equal to child windows 
			{ 
                driver.switchTo().window(win);
                driver.close();
			}
		driver.switchTo().window(parentWindow);
		
		}
		Thread.sleep(4000);
		driver.close();
	}

}




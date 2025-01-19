package Pop_up;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_javascript {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//static method of Duration class 
	    driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	    
	    driver.findElement(By.xpath("//section[text()='Popups']")).click();
	    driver.findElement(By.xpath("//section[text()='Javascript']")).click();
	    driver.findElement(By.linkText("Confirm")).click();
	    driver.findElement(By.xpath("//button[.='Confirm Box']")).click();
	    Alert a=driver.switchTo().alert();
	    Thread.sleep(3000);
	    //a.accept();
	    //a.dismiss();
	    String text = a.getText();
	    a.accept();
	    System.out.println(text);
	    Thread.sleep(3000);
	    driver.close();
	    
	    
	}

}

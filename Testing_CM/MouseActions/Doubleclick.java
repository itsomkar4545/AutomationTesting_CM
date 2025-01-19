package MouseActions;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[.='Button']")).click();
		driver.findElement(By.linkText("Double Click")).click();
		driver.findElement(By.id("btn20"));
		
		Actions a =new Actions(driver);
		Thread.sleep(3000);
		a.doubleClick().perform();
		Thread.sleep(3000);
		driver.close();
		
		
		
		

}
	}




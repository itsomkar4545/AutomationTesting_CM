package MouseActions;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drap {

	public static void main(String[] args) throws InterruptedException 
	{
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://demoapps.qspiders.com/ui?scenario=1");
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      driver.findElement(By.xpath("//section[.='Mouse Actions']")).click();
      driver.findElement(By.xpath("//section[.='Drag & Drop']")).click();
      driver.findElement(By.linkText("")).click();
      WebElement src = driver.findElement(By.xpath(""));
      WebElement dest = driver.findElement(By.xpath(""));
      Actions a= new Actions(driver);
      Thread.sleep(3000);
      a.dragAndDrop(src, dest);//It is used to drag and drop 
      Thread.sleep(4000);
      driver.close();
	}

}

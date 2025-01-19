package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollwith_Axis {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.bbc.com/");
	      JavascriptExecutor j=(JavascriptExecutor) driver;
	      int yaxis = driver.findElement(By.xpath("//h2[.='Featured video']")).getLocation().getY();//find the element locate the y axis
	      
	      j.executeScript("window.scrollBy(0,"+yaxis+")");//Cancatination
	      Thread.sleep(4000);
	      driver.close();
	}

}

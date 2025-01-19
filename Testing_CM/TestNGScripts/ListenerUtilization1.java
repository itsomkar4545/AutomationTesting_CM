package TestNGScripts;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerImplementation.class)
public class ListenerUtilization1 extends BaseClass
{
	@Test
    public void clickonTasks()
    {
	 driver.findElement(By.xpath("//div[.='Tasks']")).click();
	 driver.findElement(By.xpath("//div[.='Add Ne']")).click();
    }
	@Test
	public void clickonReports()
	{
		driver.findElement(By.xpath("//div[.='Reports']")).click();
		driver.findElement(By.xpath("//div[.='New eports']")).click();
	}
}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
 

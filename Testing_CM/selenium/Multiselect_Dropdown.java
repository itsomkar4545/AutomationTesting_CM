package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselect_Dropdown {

	public static void main(String[] args) throws InterruptedException 
	{
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://demoapps.qspiders.com/ui?scenario=1");
      Thread.sleep(3000);
      driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
      Thread.sleep(3000);
      driver.findElement(By.linkText("Multi Select")).click();
      Thread.sleep(5000);
      WebElement country = driver.findElement(By.id("select-multiple-native"));
      Select s=new Select(country);
      s.selectByIndex(0);//selection
      s.selectByValue("Germany");
      s.selectByVisibleText("Poland");
      Thread.sleep(5000);
      s.deselectByVisibleText("Germany");//Deselect one by one
      Thread.sleep(3000);                //deselectAll method use for deselect at one time	
      s.deselectByValue("Poland");
      Thread.sleep(2000);
      s.deselectByIndex(0);
      driver.close();
	}

}

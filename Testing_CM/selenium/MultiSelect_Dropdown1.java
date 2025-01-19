package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect_Dropdown1 {

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
	      String option=s.getFirstSelectedOption().getText();//only get first selected option
	      System.out.println(option);
	      Thread.sleep(3000);
	     List<WebElement>option1=s.getAllSelectedOptions();
	     for (int i = 0; i <option1.size(); i++) 
	     {
			System.out.println(option1.get(i).getText());
		 }
	     Thread.sleep(3000);
	     driver.close();
	}

}

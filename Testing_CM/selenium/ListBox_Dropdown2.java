package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_Dropdown2 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.facebook.com/");
	     driver.findElement(By.linkText("Create new account")).click();
	     Thread.sleep(5000);
	     WebElement date = driver.findElement(By.id("day"));
	     Select d =new Select(date);
	     d.selectByIndex(11);
	     Thread.sleep(3000);
	     
	     WebElement month = driver.findElement(By.id("month"));
	     Select m =new Select(month);
	     m.selectByValue("6");//ByValue method
	     Thread.sleep(3000);
	     
	     WebElement year = driver.findElement(By.id("year"));
	     Select y =new Select(year);
	     y.selectByVisibleText("2017");//ByVisibleText method
	     Thread.sleep(3000);
	     driver.close();
	}

}

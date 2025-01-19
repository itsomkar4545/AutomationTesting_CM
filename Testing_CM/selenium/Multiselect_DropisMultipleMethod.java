package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselect_DropisMultipleMethod {

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
	    boolean output = s.isMultiple();//To verify dropdown is multi select or not
	     if (output==true) 
	     {
			System.out.println("Dropdown is multi select");
		 }
	     else
	     {
			System.out.println("Dropdown is single select");
		 }
	     Thread.sleep(3000);
	     driver.close();
	}

}

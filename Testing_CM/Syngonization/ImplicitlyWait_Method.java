package Syngonization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ImplicitlyWait_Method {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//static method of Duration class
		
	    driver.manage().window().maximize();
	    driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	    
	    driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
	    
	    driver.findElement(By.linkText("Multi Select")).click();
	    
	    WebElement country = driver.findElement(By.id("select-multiple-native"));
	    Select s=new Select(country);
	    boolean output = s.isMultiple();
	     if (output==true) 
	     {
			System.out.println("Dropdown is multi select");
		 }
	     else
	     {
			System.out.println("Dropdown is single select");
		 }
	     
	     driver.close();
	}

}

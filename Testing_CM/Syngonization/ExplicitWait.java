package Syngonization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));//ExpectedConditions is class which contain 
	    wait.until(ExpectedConditions.titleContains("Text Box"));// Non-static method like titleis(); and titleContains();
	    
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

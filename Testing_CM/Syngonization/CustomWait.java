package Syngonization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	    
	    int i=0;
	    while(i<500)
	     {
	    	try {
	    		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
	    	    break;
	    	}
	    	catch(Exception e)
	    	{
	    		i++;
	    	}
	     }
	    
	    System.out.println("Custom Wait executed");
	     
	     driver.close();

	}

}

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed_Method //To check element is display or not
//return type -boolean
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.instagram.com/");
	    boolean output=driver.findElement(By.xpath("//i[@aria-label='Instagram']")).isDisplayed();
	    System.out.println(output);
	    driver.close();
	}

}

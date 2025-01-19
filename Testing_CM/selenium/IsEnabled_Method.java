package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled_Method {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.instagram.com/");
	    boolean output=driver.findElement(By.xpath("//i[@aria-label='Instagram']")).isEnabled();
	    System.out.println(output);
	    driver.close();
	}

}

package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {

	public static void main(String[] args) throws InterruptedException 
	{
     WebDriver driver =new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.flipkart.com/");
     driver.findElement(By.name("q")).sendKeys("iphone 15 pro");
     driver.findElement(By.xpath("//button[@type='submit']")).click();
     Thread.sleep(5000);
     
     driver.get("https://www.amazon.in/");
     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("pixel 9 pro");
     driver.findElement(By.id("nav-search-submit-button")).click();
     
	}

}

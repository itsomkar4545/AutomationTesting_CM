package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebook {

	public static void main(String[] args) throws InterruptedException 
	{
      WebDriver driver= new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.facebook.com/");
      driver.findElement(By.id("email")).sendKeys("02abhi757@gmail.com");
      driver.findElement(By.id("pass")).sendKeys("3748737");
      driver.findElement(By.name("login")).click();
      Thread.sleep(0);
	}

}

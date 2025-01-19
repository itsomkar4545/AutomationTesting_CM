package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
        driver.navigate().to("file:///C:/Users/02abh/OneDrive/Desktop/text2.html");
	    driver.findElement(By.name("youtube")).click();
	    Thread.sleep(5000);
	    driver.navigate().back();
	    Thread.sleep(5000);
	    driver.findElement(By.name("facebook")).click();
	    driver.navigate().back();
	    Thread.sleep(5000);
	    driver.navigate().forward();
	    Thread.sleep(5000);
	    driver.navigate().refresh();
	    Thread.sleep(5000);
	    driver.close();
	    
	}

}


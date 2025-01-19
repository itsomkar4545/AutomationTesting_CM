package MouseActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement element = driver.findElement(By.linkText("Forgotten password?"));
		Actions a=new Actions(driver);
		a.contextClick(element).perform();//non static method used to right click in place of mouse
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_W);
		Thread.sleep(3000);
		driver.quit();
	}

}


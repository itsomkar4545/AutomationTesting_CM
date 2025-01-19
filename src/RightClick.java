import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static void main(String[] args) throws InterruptedException, AWTException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\OmkarPatil\\Documents\\ChromeDrivers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		//EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/ ");
		//String Title = driver.getTitle();
		WebElement element= driver.findElement(By.linkText("Forgotten password?"));    //To Get the Title
		Actions a= new Actions(driver);
		a.contextClick(element).perform();
		Robot r = new Robot();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_W);//to press W on keyboard
		Thread.sleep(3000);  //To Wait 
		driver.close();		//To Close the Browser
	}

}

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) throws InterruptedException, AWTException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\OmkarPatil\\Documents\\ChromeDrivers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		//EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		//String Title = driver.getTitle();
		driver.findElement(By.xpath("//section[.='Button']")).click();;    //To Get the Title
		driver.findElement(By.linkText("Double Click")).click();;
		;
		WebElement element= driver.findElement(By.id("btn20"));
		Actions a= new Actions(driver);
		Thread.sleep(3000);
		a.doubleClick(element).perform();//Double click
		//Robot r = new Robot();
		Thread.sleep(5000);
		//r.keyPress(KeyEvent.VK_W);//to press W on keyboard
		//Thread.sleep(3000);  //To Wait 
		driver.close();		//To Close the Browser
	}

}

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[] args) throws InterruptedException {
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\OmkarPatil\\Documents\\ChromeDrivers\\chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	//EdgeDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.vtiger.com/");
	WebElement element= driver.findElement(By.partialLinkText("Company"));
	 Actions a= new Actions(driver);
	 a.moveToElement(element).perform();
	 Thread.sleep(2000);
	 driver.findElement(By.partialLinkText("Contact")).click();
	 System.out.println("Phone No.-  " +driver.findElement(By.xpath("//p[contains(text(),'9243602352')]")).getText());
	 Thread.sleep(3000);
	driver.close();		//To Close the Browser
}
	

}

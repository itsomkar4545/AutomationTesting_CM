import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class AutomationTesting {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\OmkarPatil\\Documents\\ChromeDrivers\\chromedriver.exe");
		 //System.setProperty("Edgedriver.Edge.driver", "C:\\Users\\OmkarPatil\\Documents\\ChromeDrivers\\msedgedriver.exe");
	        
		WebDriver driver = new ChromeDriver();
	     //EdgeDriver driver = new EdgeDriver();   
	        // Navigate to the Website
	        driver.get("https://codemanager.pythonanywhere.com/register");

	        // User Registration
	        // Assuming you have fields like first name, last name, user-name, email, password, etc.
	        
	       
	        driver.findElement(By.id("fname-input")).sendKeys("automation");
	        
	        driver.findElement(By.id("lname-input")).sendKeys("Testing");
 
	        driver.findElement(By.id("email-input")).sendKeys("Test123@example.com");

	        driver.findElement(By.id("user-input")).sendKeys("selenium");

	        driver.findElement(By.id("pwd-input")).sendKeys("Test@123");
	        
	        driver.findElement(By.id("cnf-pwd")).sendKeys("Test@123");

	        driver.findElement(By.xpath("/html/body/div[1]/form/button")).click();
	       
	 
	      // Login
	        driver.get("https://codemanager.pythonanywhere.com/login"); 

	        driver.findElement(By.id("user-input")).sendKeys("selenium");

	        driver.findElement(By.id("pwd-input")).sendKeys("Test@123");

	        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/button")).click();
	        
	        // Close the browser
	        //driver.quit();

	}

}

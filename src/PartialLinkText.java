import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\OmkarPatil\\Documents\\ChromeDrivers\\chromedriver.exe");
				ChromeDriver driver= new ChromeDriver();
				//EdgeDriver driver = new EdgeDriver();
				driver.manage().window().maximize();
				
				driver.get("https://www.facebook.com/");
				Thread.sleep(3000);  //To Wait 
				
				driver.findElement(By.partialLinkText("new")).click();  //single text 
				Thread.sleep(3000);
				
				driver.findElement(By.name("firstname")).sendKeys("Omkar");//BY Name 
				
				driver.findElement(By.name("lastname")).sendKeys("Patil");//By Name as  the id has numbers as value so prefer 1)id 2)name 3)text
				Thread.sleep(3000);
				driver.navigate().refresh(); //Refresh the Page
				Thread.sleep(3000);
				driver.close();	


		 
	}

}

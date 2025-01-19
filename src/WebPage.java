import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPage {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\OmkarPatil\\Documents\\ChromeDrivers\\chromedriver.exe");
				ChromeDriver driver= new ChromeDriver();
				//EdgeDriver driver = new EdgeDriver();
				driver.manage().window().maximize();
				
				driver.get("file:///C:/Users/OmkarPatil/Desktop/Webpage.html");
				Thread.sleep(5000);  //To Wait 
				
				driver.findElement(By.id("yt")).click();
				Thread.sleep(5000);
				driver.navigate().back();  //Navigate Backward
				//driver.navigate().forward();  //Navigate Forward
				//driver.navigate().refresh();  //Refresh 
				Thread.sleep(3000);
				driver.findElement(By.linkText("FaceBook")).click();
				Thread.sleep(5000);
				driver.navigate().back();
				Thread.sleep(3000);
				
				driver.close();	
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowId {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\OmkarPatil\\Documents\\ChromeDrivers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		//EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);  //To Wait 
		//String Winid = driver.getWindowHandle();
		System.out.println("Window Id: "+driver.getWindowHandle()); //getWindow ID 
		Thread.sleep(3000);
		driver.close();	
	}

}

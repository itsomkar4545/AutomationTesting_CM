import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMultipleWin {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\OmkarPatil\\Documents\\ChromeDrivers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		//EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	   //To Wait 
		//String Winid = driver.getWindowHandle();
		
		//driver.findElement(By.xpath("//*[@id=\"optionsBody\"]/a[1]/div/main")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//section[.='Popups']")).click();
		driver.findElement(By.xpath("//section[.='Browser Windows']")).click();
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.xpath("//button[text()='Click to open multiple popup windows']")).click();
		Thread.sleep(2000);
		String Winid= driver.getWindowHandle();//get windows id
		System.out.println("Parent Window Id: "+Winid);
		
		Set<String> AllWinid=  driver.getWindowHandles();//to store the values of window is one by one
		
		for (String winid:AllWinid)
		{
			if (!winid.equals(Winid)) {
                driver.switchTo().window(winid);
                Thread.sleep(2000);  // Pause
                System.out.println("Closing child window with ID: " + winid);
                driver.close();  // Close the child window
		}
		//System.out.println("Window Id: "+driver.getWindowHandle()); //getWindow ID 
		driver.switchTo().window(Winid);
		
		//driver.quit();// close all the windows 	
	}
	
	}
}

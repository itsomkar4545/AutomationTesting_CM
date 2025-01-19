package Pop_up;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_Popup {

	public static void main(String[] args) throws InterruptedException 
	{
      ChromeOptions option= new ChromeOptions();
      option.addArguments("--disable-notifications");
      
      WebDriver driver= new ChromeDriver(option);
      driver.manage().window().maximize();
      driver.get("https://www.yatra.com/");
      Thread.sleep(3000);
      driver.close();
      
      
	}

}

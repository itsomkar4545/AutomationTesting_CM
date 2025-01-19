package Pop_up;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownload_Popup {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
      WebDriver driver=new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      driver.get("https://www.facebook.com/");
      Thread.sleep(5000);
     Robot r = new Robot();
     r.keyPress(KeyEvent.VK_CONTROL);
     r.keyPress(KeyEvent.VK_S);
     r.keyRelease(KeyEvent.VK_CONTROL);
     r.keyPress(KeyEvent.VK_TAB);
     Thread.sleep(5000);
     driver.close();
     
	}

}

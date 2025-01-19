package MouseActions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Down {

	public static void main(String[] args) throws InterruptedException 
	{
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.bbc.com/");
      JavascriptExecutor j=(JavascriptExecutor) driver;//javascript executor//Perform type casting
      j.executeScript("window.scrollBy(0,2000)");//scroll down
      Thread.sleep(4000);
      j.executeScript("window.scrollBy(0,-2000)");//scroll up
      Thread.sleep(4000);
      driver.close();
      
	}

}

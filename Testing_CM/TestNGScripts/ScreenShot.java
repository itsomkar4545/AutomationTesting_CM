package TestNGScripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class ScreenShot 
{
  @Test
  public void takes() throws IOException, InterruptedException
  {
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  TakesScreenshot t=(TakesScreenshot)driver;
	  File src = t.getScreenshotAs(OutputType.FILE);
	  File dest=new File("./ScreenShot/ss.png");
	  Files.copy(src, dest);
	  Thread.sleep(3000);
	  driver.close();
	  
  }
}

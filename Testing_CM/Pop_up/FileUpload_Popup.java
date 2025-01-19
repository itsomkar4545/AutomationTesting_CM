package Pop_up;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_Popup {

	public static void main(String[] args) throws InterruptedException
	{
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      driver.get("https://demoapps.qspiders.com/ui?scenario=1");
      driver.findElement(By.xpath("//section[.='Popups']")).click();
      driver.findElement(By.xpath("//section[.='File Uploads']")).click();
      
      //File f = new File("./Folder name/file name.pdf or doc");
      File f =new File("./Testdata+/Notepad.pdf");
      String path = f.getAbsolutePath();
      Thread.sleep(4000);
      driver.findElement(By.id("fileInput")).sendKeys(path);
      Thread.sleep(4000);
      driver.close();
      
      
      
	}

}

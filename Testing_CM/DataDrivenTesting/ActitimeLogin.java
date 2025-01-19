package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin {

	public static void main(String[] args) throws IOException, InterruptedException
	{
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      
      FileInputStream fis=new FileInputStream("./Testdata/CommonData.property");
      Properties p=new Properties();
      p.load(fis);
      String URL=p.getProperty("url");
      driver.get(URL);
      
      String un=p.getProperty("username");
      driver.findElement(By.id("username")).sendKeys(un);
      
      String pwd=p.getProperty("password");
      driver.findElement(By.name("pwd")).sendKeys(pwd);
      Thread.sleep(3000);			
      
      driver.findElement(By.xpath("//div[.='Login ']")).click();
      Thread.sleep(5000);
      driver.close();
      
	}

}

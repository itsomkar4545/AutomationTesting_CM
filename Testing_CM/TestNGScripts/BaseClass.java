package TestNGScripts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import DataDrivenTesting.MethodsForDDT;

public class BaseClass 
{
	public static WebDriver driver;
	MethodsForDDT m=new MethodsForDDT();
  @BeforeSuite
  public void databaseConnect()
  {
	  Reporter.log("Data Base connection is done",true);
  }
  @BeforeTest
  public void launchBrowser() throws IOException
  {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  String URL = m.readDataFromProperty("url");
	  driver.get(URL);
	  Reporter.log("Browser launch",true);
  }
  @BeforeMethod
  public void loginToActitime() throws IOException
  {
	  String un = m.readDataFromProperty("username");
	  driver.findElement(By.id("username")).sendKeys(un);
	  

	  String pw= m.readDataFromProperty("password");
	  driver.findElement(By.name("pwd")).sendKeys(pw);
	  
	  driver.findElement(By.xpath("//div[.='Login ']")).click();
	  Reporter.log("login successfully",true);
  }
  @AfterMethod
  public void logout()
  {
	  driver.findElement(By.id("logoutLink")).click();
	  Reporter.log("Logout successfully",true);
  }
  @AfterTest
  public void CloseBrowser()
  {
	  driver.close();
	  Reporter.log("Browser get close",true);
  }
  
  @AfterSuite
  public void disconnectedDB()
  {
	  Reporter.log("DB Disconnect ",true);
  }
}

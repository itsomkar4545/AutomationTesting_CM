package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelDataHandle {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  //Notepad Data
	  FileInputStream fis=new FileInputStream("./Testdata/CommonData.property");
	  Properties p=new Properties();
	  p.load(fis);
	  String URL=p.getProperty("url");
	  //MethodsForDDT m=new MethodsForDDT();
	  //String URL=m.readFromProperty("url");
	  driver.get(URL);
	  
	  String un=p.getProperty("username");//String un=m.readFromProperty("username");
      driver.findElement(By.id("username")).sendKeys(un);
      
      String pwd=p.getProperty("password"); //String pwd=m.readFromProperty("password");
	  driver.findElement(By.name("pwd")).sendKeys(pwd);
      driver.findElement(By.xpath("//div[.='Login ']")).click();
  
      driver.findElement(By.linkText("Tasks")).click();
      driver.findElement(By.xpath("//div[.='Add New']")).click();
	  driver.findElement(By.xpath("//div[.='New Customer']")).click();
	  
      //Excel Data fetch
	  FileInputStream fis1=new FileInputStream("./Testdata/testdata.xlsx");
	  Workbook wb = WorkbookFactory.create(fis1);
	  //String Customername = wb.getSheet("TestingData").getRow(1).getCell(1).getStringCellValue();
	  MethodsForDDT m=new MethodsForDDT();
	  String Customername = m.readDataFromExcel("TestingData",5,1);
	  driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys(Customername);
	  
	 
	//String Discription = wb.getSheet("TestingData").getRow(1).getCell(2).getStringCellValue();
	  String Discription = m.readDataFromExcel("TestingData",5,2);
      driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys(Discription);
      
      driver.findElement(By.xpath("(//div[.='- Select Customer -'])[1]")).click();
      driver.findElement(By.xpath("(//div[.='Galaxy Corporation'])[7]")).click();
      Thread.sleep(4000);
      //driver.close();
     
      
      
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BYXPATH {
public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\OmkarPatil\\Documents\\ChromeDrivers\\chromedriver.exe");
				ChromeDriver driver= new ChromeDriver();
				//EdgeDriver driver = new EdgeDriver();
				driver.manage().window().maximize();
				
				driver.get("https://www.flipkart.com/");
				Thread.sleep(3000);  //To Wait 
				
				/*driver.findElement(By.tagName(span[role='button']).click();  //using tagname (syntax- tagname[attri name='attri value'])
				Thread.sleep(3000);*/
				
				//driver.findElement(By.linkText("Search Icon")).click();//BY Name 
				
				driver.findElement(By.className("Pke_EE")).sendKeys("Samsung S23 Ultra");//By class 1)id 2)name 3)text
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[type='submit']")).click(); //BY XPath by attribute & use the syntax(line15) in double  code
				System.out.println(driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy S23 Ultra 5G (Green, 1 TB)']")).getText());  //By XPath by text function & use the syntax --> //tagname[text()='text'] & getText method to get the title hh 
				Thread.sleep(3000);
				driver.navigate().back(); //Refresh the Page
				driver.findElement(By.className("Pke_EE")).sendKeys("Samsung S24 Ultra");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@title='submit']")).click(); 
				System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Titanium Violet, 1 TB')]")).getText());//by contains function 
				
				//driver.navigate().refresh(); //Refresh the Page
				Thread.sleep(5000);
				driver.close();	


		 
	}

}

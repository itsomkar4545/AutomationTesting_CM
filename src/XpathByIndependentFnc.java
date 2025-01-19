import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndependentFnc {
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
				driver.findElement(By.className("_2iLD__")).click();//BY LinkText
				//driver.navigate().refresh(); //Refresh the Page
				Thread.sleep(3000);
				System.out.println(driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy S23 Ultra 5G (Green, 1 TB)']")).getText());  //By XPath by text function & use the syntax --> //tagname[text()='text'] & getText method to get the title hh 
				System.out.println(driver.findElement(By.xpath("(//div[text()='SAMSUNG Galaxy S23 Ultra 5G (Green, 1 TB)'])//../..//../div[2]/div[2]/div[1]/div[1]/div[1]")).getText());
				Thread.sleep(3000);
				driver.navigate().back();
				

				driver.get("https://www.amazon.in/");
				Thread.sleep(3000);
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung Galaxy S24 Ultra");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
				Thread.sleep(3000);
				
				System.out.println(driver.findElement(By.xpath("//span[text()='Samsung Galaxy S24 Ultra 5G AI Smartphone (Titanium Black, 12GB, 256GB Storage)']")).getText());  //By XPath by text function & use the syntax --> //tagname[text()='text'] & getText method to get the title hh 
				System.out.println(driver.findElement(By.xpath("(//span[text()='Samsung Galaxy S24 Ultra 5G AI Smartphone (Titanium Black, 12GB, 256GB Storage)'])/../../../../div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/span[1]")).getText());// By independent & dependent 
				Thread.sleep(3000);
				driver.close();	


		 
	}
}

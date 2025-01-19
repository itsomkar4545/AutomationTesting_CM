import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelection {
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
				Thread.sleep(5000);
				driver.close();	


		 
	}

}

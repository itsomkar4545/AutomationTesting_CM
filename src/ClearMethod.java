import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod  {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\OmkarPatil\\Documents\\ChromeDrivers\\chromedriver.exe");
				ChromeDriver driver= new ChromeDriver();
				//EdgeDriver driver = new EdgeDriver();
				driver.manage().window().maximize();
				
				driver.get("https://www.facebook.com/");
				Thread.sleep(3000);  //To Wait 
				//System.out.println("Is Button Enabled: "+driver.findElement(By.id("//*[@id=\"u_0_5_lK\"]")).isEnabled());
				
				driver.findElement(By.id("email")).sendKeys("Daredevil@32gmail.com");//BY Name 
				
				driver.findElement(By.id("pass")).sendKeys("745VH445chgjhj");//By Name as  the id has numbers as value so prefer 1)id 2)name 3)text
				Thread.sleep(3000);
				
				//driver.findElement(By.id("email")).clear();  //clear 
				//Thread.sleep(5000);
				System.out.println("CLASS VALUE: "+driver.findElement(By.xpath("//img[@alt='Facebook']")).getAttribute("class")); //getAttribute Method accept parameter 
				Thread.sleep(3000);
				
				System.out.println("CSS HEIGHT: "+driver.findElement(By.xpath("//img[@alt='Facebook']")).getCssValue("height"));  //getCssValue accept parameter
				Thread.sleep(3000);
				
				System.out.println("TagName: "+driver.findElement(By.id("email")).getTagName());//getTagName it don't accept parameter
				Thread.sleep(3000);
				
				System.out.println("HEIGHT: "+driver.findElement(By.xpath("//img[@alt='Facebook']")).getSize().getHeight()); //get height
				System.out.println("WIDTH: "+driver.findElement(By.xpath("//img[@alt='Facebook']")).getSize().getWidth());  //get width
				Thread.sleep(3000);
				
				System.out.println("Xaxis: "+driver.findElement(By.id("pass")).getLocation().getX()); //get Xaxis location of element 
				System.out.println("Yaxis: "+driver.findElement(By.id("pass")).getLocation().getY()); //get Yaxis location of element
				System.out.println("Is Logo Displayed: "+driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed()); //to show is that element is displayed or not 
				System.out.println("Is Button Enabled: "+driver.findElement(By.xpath("//*[@id=\"u_0_5_lK\"]")).isEnabled());
				Thread.sleep(3000);
				driver.close();	


		 
	}

}

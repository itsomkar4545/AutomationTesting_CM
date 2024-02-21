import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.edge.EdgeDriver;

public class AutomationTesting {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\OmkarPatil\\Documents\\ChromeDrivers\\chromedriver.exe");
		 //System.setProperty("Edgedriver.Edge.driver", "C:\\Users\\OmkarPatil\\Documents\\ChromeDrivers\\msedgedriver.exe");
	        
		WebDriver driver = new ChromeDriver();
	     //EdgeDriver driver = new EdgeDriver();   
	        // Navigate to the Website
	        driver.get("https://codemanager.pythonanywhere.com/register");

	        // User Registration
	        // Assuming you have fields like first name, last name, user-name, email, password, etc.
	        
	       
	        driver.findElement(By.id("fname-input")).sendKeys("automation");
	        
	        driver.findElement(By.id("lname-input")).sendKeys("Testing");
 
	        driver.findElement(By.id("email-input")).sendKeys("Test123@example.com");

	        driver.findElement(By.id("user-input")).sendKeys("selenium");

	        driver.findElement(By.id("pwd-input")).sendKeys("Test@123");
	        
	        driver.findElement(By.id("cnf-pwd")).sendKeys("Test@123");

	        driver.findElement(By.xpath("/html/body/div[1]/form/button")).click();
	       
	 
	      // Login
	        driver.get("https://codemanager.pythonanywhere.com/login"); 

	        driver.findElement(By.id("user-input")).sendKeys("selenium");

	        driver.findElement(By.id("pwd-input")).sendKeys("Test@123");

	        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/button")).click();
	        
	        //Add Question
	         driver.get("https://codemanager.pythonanywhere.com/add_question");
	         
	         driver.findElement(By.id("id_title")).sendKeys("write a code to find prime no.");
	         
	         driver.findElement(By.id("id_link")).sendKeys("https://www.geeksforgeeks.org/python-program-to-check-whether-a-number-is-prime-or-not/");
	         
	         driver.findElement(By.id("id_description")).sendKeys("Given a positive integer N, The task is to write a Python program to check if the number is Prime or not in Python.");
	         
	         Select dropdown = new Select(driver.findElement(By.id("id_difficulty")));
	         dropdown.selectByVisibleText("Medium");
	        // dropdown.selectByIndex(1);     //It select through index value
	         
	         
	         driver.findElement(By.xpath("//*[@id=\"id_tag\"]/option[3]")).click(); 
	         
	           
	         
	         driver.findElement(By.id("id_examples")).sendKeys("Input:  n = 11\r\n" + 
	         		"Output: True\r\n" + 
	         		"\r\n" + 
	         		"\r\n" + 
	         		"Input:  n = 1\r\n" + 
	         		"Output: False\r\n" + 
	         		"\r\n" + 
	         		"Explanation: A prime number is a natural number greater than 1 that\r\n" + 
	         		" has no positive divisors other than 1 and itself.\r\n" + 
	         		"  The first few prime numbers are {2, 3, 5, 7, 11, ….}. ");
	         
	       /*  driver.findElement(By.xpath("/html/body/div[1]/form/input[2]")).click();  // RESET BUTTON 
	         
	         driver.findElement(By.id("id_title")).sendKeys("write a code to find prime no.");
	         
	         driver.findElement(By.id("id_link")).sendKeys("https://www.geeksforgeeks.org/python-program-to-check-whether-a-number-is-prime-or-not/");
	         
	         driver.findElement(By.id("id_description")).sendKeys("Given a positive integer N, The task is to write a Python program to check if the number is Prime or not in Python.");
	         
	         Select dropdown = new Select(driver.findElement(By.id("id_difficulty")));
	         dropdown.selectByVisibleText("Medium");
	        // dropdown.selectByIndex(1);     //It select through index value
	         
	         driver.findElement(By.id("id_tag"));
	         dropdown.selectByVisibleText("Python");
	         
	         driver.findElement(By.id("id_examples")).sendKeys("Input:  n = 11\r\n" + 
	         		"Output: True\r\n" + 
	         		"\r\n" + 
	         		"\r\n" + 
	         		"Input:  n = 1\r\n" + 
	         		"Output: False\r\n" + 
	         		"\r\n" + 
	         		"Explanation: A prime number is a natural number greater than 1 that\r\n" + 
	         		" has no positive divisors other than 1 and itself.\r\n" + 
	         		"  The first few prime numbers are {2, 3, 5, 7, 11, ….}. ");*/     
	         
	         
	         
	         driver.findElement(By.xpath("/html/body/div[1]/form/button")).click();
	         
	         
	         
	         
	        
	        // Close the browser
	        //driver.quit();

	}

}

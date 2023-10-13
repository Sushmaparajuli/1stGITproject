package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_junit {
	
	WebDriver driver;
	@Before
	public void LunchChrome() {

	System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
	 driver = new ChromeDriver();

	driver.manage().deleteAllCookies();

	driver.get("http://www.techfios.com/billing/?ng=admin/");
	// max window
	driver.manage().window().maximize();
	// manage time
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	}
	@After
	public void CloseBrowser() throws InterruptedException {
		  Thread.sleep(3000);
	        driver.close();
	        
	}
	 @Test
	public void positiveLoginTest() {
	// for putting id
	driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
	// for password
	driver.findElement(By.name("password")).sendKeys("abc123");
	// click or submit
	driver.findElement(By.name("login")).click();
	}
     @Test
	public void negativeLoginTest() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios12.com");
		// for password
		driver.findElement(By.name("password")).sendKeys("abc123");
		// click or submit
		driver.findElement(By.name("login")).click();
		}
		
	
	}




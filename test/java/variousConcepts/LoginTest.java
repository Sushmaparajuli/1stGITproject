package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws Exception {
		
		//System.setProperty(" webdriver.chrome.driver", "C:\\Users\\kader\\Desktop\\SeleniumNew\\crm\\driver\\chromedriver.exe");
		
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.techfios.com/billing/?ng=admin/");
		//max window
		driver.manage().window().maximize();
		//manage time
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //for putting id 
        driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
        //for password
        driver.findElement(By.name("password")).sendKeys("abc123");
        //click or submit
        driver.findElement(By.name("login")).click();
        Thread.sleep(3000);
        driver.close();
        
        
	}

}

package finaltestng;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Category {
	
	
	WebDriver driver;
  
 

@BeforeTest
	public void init() {

	
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
        driver.get("https://techfios.com/test/101/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
}
		@Test
		public void Addcategory() throws InterruptedException {
		
	        WebElement inputField = driver.findElement(By.name("categorydata"));
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"extra\"]/input[1]")).isDisplayed();

	        Thread.sleep(3000);
	        inputField.clear();

	        inputField.sendKeys("techfios79");

	      Thread.sleep(3000);
	        inputField.sendKeys(Keys.RETURN);

	        // Close the browser
	        driver.quit();
		
	
		
		}


;
	
    

 
    public void getName() {
        return;
    }
@AfterTest
  public void tearDown() {
	  driver.close();
	  driver.quit();
  }
    
	}

    

	
		  


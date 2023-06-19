package finaltestng;


	import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




	public class DuplicateCategory<Arraylist> {
		// declaring a global variable
		WebDriver driver;

		@BeforeMethod
		public void init() {
			// getting the webdriver
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

			driver = new ChromeDriver();

			driver.get("https://techfios.com/test/101/");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();

		}

		@Test
			public void duplicateCategoryValidation()  {
				
			WebElement inputField = driver.findElement(By.name("categorydata"));
				
		        try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        driver.findElement(By.xpath("//*[@id=\"extra\"]/input[1]")).isDisplayed();

		        try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        inputField.clear();

		        inputField.sendKeys("Clarakdec22");
		        ArrayList categorydata =  new ArrayList();
				categorydata.add(categorydata);
				
				
				System.out.println("The category you want to add already exists");
				
		}
		

	

		@AfterTest
		public void tearDown() {
			driver.close();
			driver.quit();
		}

	}
	

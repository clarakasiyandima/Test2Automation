package finaltestng;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MonthDropDown {
	WebDriver driver;
	@Test
	public void verify () {
		try {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" http://techfios.com/test/101/");
		
		
		
	Select select =new Select(driver.findElement(By.xpath("//*[@id=\"extra\"]/select[3]")));
	
		
		List actualDropdownValue = new ArrayList();
		for(WebElement element:select.getOptions()) {
			actualDropdownValue.add(element.getText());
		
		}
		List expectedDropDownValue = new ArrayList();
		List actualDropdownValue1 = new ArrayList();
		
		expectedDropDownValue.add("Jan");
			
		expectedDropDownValue.add("Feb");
		expectedDropDownValue.add("Mar");
		expectedDropDownValue.add("Apr");
		expectedDropDownValue.add("May");
		expectedDropDownValue.add("June");
		expectedDropDownValue.add("July");
		expectedDropDownValue.add("Aug");
		expectedDropDownValue.add("Sep");
		expectedDropDownValue.add("Oct");
		expectedDropDownValue.add("Nov");
		expectedDropDownValue.add("Dec");
		
		
	
		for(int i = 0; i < actualDropdownValue1.size();i++) {
		System.out.println("actual:" + actualDropdownValue1.get(i)+"&Expected");
		
		Assert.assertTrue(actualDropdownValue1.get(i).equals(expectedDropDownValue.get(i)));
		}
		}
		finally {
			
		}
		
	}
}
		

	
		

		
	

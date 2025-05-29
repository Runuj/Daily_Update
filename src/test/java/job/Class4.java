package job;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Class4 {

	public static void main(String[] args) {
		// Install TestNG and use of Assertion
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		String expected_value ="Practice Page";
		String actual_value=driver.getTitle();
		Assert.assertEquals(expected_value, actual_value);
		driver.quit();
	}

}
  
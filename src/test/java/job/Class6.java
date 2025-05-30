package job;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class6 {

	public static void main(String[] args) throws InterruptedException {
		// Linked text and partial linked text locators
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		WebElement link = driver.findElement(By.partialLinkText("Orange"));
		link.click();
		System.out.println(link.isDisplayed());
		System.out.println(link.isEnabled());
		driver.quit();
	}

}

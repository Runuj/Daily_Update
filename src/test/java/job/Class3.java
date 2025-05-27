package job;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3 {

	public static void main(String[] args) {
		// -----LOGIN A PAGE ------locators
		WebDriver driver =new ChromeDriver();
		driver.get("http://147.93.44.137:3000/login?returnUrl=%2Fdashboard");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@class='btn btn-primary px-5 py-2']")).click();
		driver.findElement(By.xpath("(//input[@type='email'])[2]")).sendKeys("Runu.jena@performalytic.com");
		driver.findElement(By.id("pass")).sendKeys("12345");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.quit();
		
	}

}

package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNowWindow {
	
	public ChromeDriver driver;
	public static String incNum="";
	@BeforeMethod
	public void precondition() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://dev111627.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//login itself inside frame
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("admin");
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("India@123");
		driver.findElement(By.xpath("//button[@id=\"sysverb_login\"]")).click();

	}
	/*
	 * @AfterMethod public void postcondition() {
	 * 
	 * driver.close();
	 * 
	 * 
	 * }
	 */
}

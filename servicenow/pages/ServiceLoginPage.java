package servicenow.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ServiceNowWindow;

public class ServiceLoginPage extends ServiceNowWindow{
	
	public ServiceLoginPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	
	public ServiceLoginPage enterUserName() {
		
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("admin");
		return this;

	}
	
	public ServiceLoginPage enterServicePassword() {
		
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("India@123");
		return this;

	}
	
	public ServiceIncidentPage enterServiceLoginButton() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id=\"sysverb_login\"]")).click();
		Thread.sleep(5000);
		return new ServiceIncidentPage(driver);

	}
	
	

}

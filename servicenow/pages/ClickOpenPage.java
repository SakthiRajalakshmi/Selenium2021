package servicenow.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ServiceNowWindow;

public class ClickOpenPage extends ServiceNowWindow{
	
	public ClickOpenPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public ClickOpenPage enterInci() {
		
		driver.findElement(By.xpath("//input[@id=\"filter\"]")).sendKeys("incident",Keys.ENTER);
		return this;

	}
	
	public ExistingIncidentPage clickOpen() throws InterruptedException {
		
		driver.findElement(By.xpath("//div[text()='Open']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("gsft_main");
		return new ExistingIncidentPage(driver);

	}

}

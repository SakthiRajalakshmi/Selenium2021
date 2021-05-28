package servicenow.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ServiceNowWindow;

public class ServiceIncidentPage extends ServiceNowWindow{
	
	public ServiceIncidentPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public ServiceIncidentPage enterIncident() {
		
		driver.findElement(By.xpath("//input[@id=\"filter\"]")).sendKeys("incident",Keys.ENTER);
		return this;

	}
	
	public IncidentNewRecordPage clickCreateNew() {
		
		driver.findElement(By.xpath("//div[text()='Create New']")).click();
		return new IncidentNewRecordPage(driver);

	}

}

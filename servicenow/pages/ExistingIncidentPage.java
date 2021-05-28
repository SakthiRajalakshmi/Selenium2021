package servicenow.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ServiceNowWindow;

public class ExistingIncidentPage extends ServiceNowWindow {
	
	public ExistingIncidentPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public UpdateStatePage searchExIncident() {
		
		//String text = driver.findElement(By.xpath("(//a[@class='linked formlink'])[1]")).getText();
		driver.findElement(By.xpath("(//input[@placeholder='Search'])[2]")).sendKeys("INC0010775",Keys.ENTER);
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		
		return new UpdateStatePage(driver);
		

	}

}

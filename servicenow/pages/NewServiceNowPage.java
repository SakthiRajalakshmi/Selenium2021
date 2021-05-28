package servicenow.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ServiceNowWindow;

public class NewServiceNowPage extends ServiceNowWindow {
	
	public NewServiceNowPage(ChromeDriver driver) {
		this.driver=driver;
		

	}
	
	public NewServiceNowPage verifyNewIncident() {
		
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(incNum,Keys.ENTER);
		System.out.println(incNum);
		String text = driver.findElementByXPath("//a[@class='linked formlink']").getText();
		System.out.println(text);
		if (text.equals(incNum))

			System.out.println("Incident has been created");
		else
			System.out.println("Incident not created");
		
		return this;
	

		
		

	}

}

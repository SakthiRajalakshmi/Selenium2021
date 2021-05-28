package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.LeafTabMethod;

public class MyLeadPage extends LeafTabMethod{
	
	public MyLeadPage(ChromeDriver driver) {
		
		this.driver=driver;
	}

	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.linkText(prop.getProperty("MyLeadPage.CreateLead.LinkText"))).click();
		
		return new CreateLeadPage(driver);
		
		
	}
	
}

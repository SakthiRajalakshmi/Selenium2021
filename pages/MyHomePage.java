package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.LeafTabMethod;

public class MyHomePage extends LeafTabMethod{
	
	public MyHomePage(ChromeDriver driver) {
		
		this.driver=driver;
	}

	public MyLeadPage clickLeadButton() {
		
		driver.findElement(By.linkText(prop.getProperty("MyHomePage.Leads.LinkText"))).click();
		
		return new MyLeadPage(driver);

	}

}

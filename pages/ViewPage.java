package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.LeafTabMethod;

public class ViewPage extends LeafTabMethod {
	
	public ViewPage(ChromeDriver driver) {
		
		this.driver=driver;
	}

	public ViewPage viewFirstName() {
		
		System.out.println(driver.findElement(By.id("viewLead_firstName_sp")).getText());		
		return this;

	}

}

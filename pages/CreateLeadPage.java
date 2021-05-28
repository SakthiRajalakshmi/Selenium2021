package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.LeafTabMethod;

public class CreateLeadPage extends LeafTabMethod {
	
	public CreateLeadPage(ChromeDriver driver) {
		
		this.driver=driver;
	}
	public CreateLeadPage enterCompanyName(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		return this;
	}
	public CreateLeadPage enterFirstName(String fName) {
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		return this;

	}
	public CreateLeadPage enterLastName(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		return this;
	}
	
	public ViewPage clickCreateLeadButton() {
		
		driver.findElement(By.name("submitButton")).click();
		return new ViewPage(driver);

	}

}

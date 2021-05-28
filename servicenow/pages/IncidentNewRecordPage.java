package servicenow.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ServiceNowWindow;

public class IncidentNewRecordPage extends ServiceNowWindow{
	
	
	public IncidentNewRecordPage(ChromeDriver driver) {
		this.driver=driver;
		

	}
	public CallerInfoPage clickSearchCaller() {
		
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//span[@class=\"icon icon-search\"]")).click();
		
		return new CallerInfoPage(driver);

	}
	
	public ShortDesNewWindowPage clickShortdesSearch() {
		
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("lookup.incident.short_description")).click();
		return new ShortDesNewWindowPage(driver);

	}
	
	public NewServiceNowPage clickSubmitToCreate(String val) {
		
		driver.switchTo().frame("gsft_main");
		val = driver.findElement(By.xpath("//input[@id=\"incident.number\"]")).getAttribute("value");
		incNum=incNum+val;
		System.out.println(incNum);
		driver.findElement(By.xpath("//button[@id=\"sysverb_insert\"]")).click();
		return new NewServiceNowPage(driver);

	}

}

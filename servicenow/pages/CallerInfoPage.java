package servicenow.pages;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ServiceNowWindow;

public class CallerInfoPage extends ServiceNowWindow {
	
	public Set<String> windowHandles;
	public ArrayList<String> handle;
	public String secondWindow;
	
	
	public CallerInfoPage(ChromeDriver driver) {
		this.driver=driver;

}
	public CallerInfoPage clickSearchCallName() {
		windowHandles=driver.getWindowHandles();
		handle=new ArrayList<String>(windowHandles);
		secondWindow=handle.get(1);
		driver.switchTo().window(secondWindow);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Sa",Keys.ENTER);
		return this;
	}
	
	public IncidentNewRecordPage selectFirstElement() {
		
		driver.findElement(By.xpath("//a[contains(text(),'Sa')]")).click();
		driver.switchTo().window(handle.get(0));
		return new IncidentNewRecordPage(driver);
		
}

	}

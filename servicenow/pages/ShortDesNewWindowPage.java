package servicenow.pages;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ServiceNowWindow;

public class ShortDesNewWindowPage extends ServiceNowWindow {
	
	public ShortDesNewWindowPage(ChromeDriver driver) {
		this.driver=driver;
		

	}
	
	public IncidentNewRecordPage clickFirstDes() {
		Set <String> windowHandle1=driver.getWindowHandles();
		ArrayList<String> handle1=new ArrayList<String>(windowHandle1);
		String second=handle1.get(1);
		driver.switchTo().window(second);
		driver.findElement(By.xpath("//a[text()=\"Issue with email\"]")).click();
		driver.switchTo().window(handle1.get(0));
		
		return new IncidentNewRecordPage(driver);

	}
	
	

}

package servicenow.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ServiceNowWindow;

public class ResolveStatePage extends ServiceNowWindow  {
	
	public ResolveStatePage(ChromeDriver driver) {
		this.driver=driver;
		

	}
public ResolveStatePage verifyResolve() {
   System.out.println(driver.findElement(By.xpath("(//td[@class=\"vt\"])[6]")).getText());
   return this;
}

public ResolveStatePage verifyPriorityState() {
	System.out.println(driver.findElement(By.xpath("//table[@id='incident_table']/tbody[1]/tr[1]/td[7]")).getText());
	System.out.println(driver.findElement(By.xpath("\r\n" + 
			"//table[@id='incident_table']/tbody[1]/tr[1]/td[8]")).getText());
	
	return this;

	
}

public void verifyGroup() {
	
	System.out.println(driver.findElement(By.xpath("//table[@id='incident_table']/thead[1]/tr[1]/th[10]/span[1]/a[1]")).getText());
	System.out.println(driver.findElement(By.xpath("//table[@id='incident_table']/thead[1]/tr[1]/th[11]/span[1]/a[1]")).getText());

}
}

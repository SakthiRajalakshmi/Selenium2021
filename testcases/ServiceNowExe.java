package testcases;

import org.testng.annotations.Test;

import base.ServiceNowWindow;
import servicenow.pages.ServiceIncidentPage;
import servicenow.pages.ServiceLoginPage;

public class ServiceNowExe extends ServiceNowWindow {
	@Test
	public void exeServiceNow() {
		new ServiceIncidentPage(driver)
		.enterIncident()
		.clickCreateNew()
		.clickSearchCaller().clickSearchCallName().selectFirstElement()
		.clickShortdesSearch().clickFirstDes()
		.clickSubmitToCreate("val")
		.verifyNewIncident();
		
		
		

	}
	
	

}

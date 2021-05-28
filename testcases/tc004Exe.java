package testcases;

import org.testng.annotations.Test;

import base.ServiceNowWindow;
import servicenow.pages.ClickOpenPage;
import servicenow.pages.ServiceLoginPage;

public class tc004Exe extends ServiceNowWindow{
	
	@Test
	public void exeTC004() throws InterruptedException {
		
		new ClickOpenPage(driver).enterInci().clickOpen()
		.searchExIncident().updateCategoryWorkNote().verifyGroup();
		
		
		
		

	}

}

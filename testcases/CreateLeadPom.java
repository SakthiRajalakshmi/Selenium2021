package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.LeafTabMethod;
import pages.LoginPage;



public class CreateLeadPom extends LeafTabMethod{
	@BeforeTest
	public void setFileName() {
		excelfilename="CreateLead";

	}
	@Test(dataProvider = "sendData")
	public void createLeadExe(String CName,String fName,String lName) {
		
		//LoginPage lp=new LoginPage();
		
		new LoginPage(driver)
		.enterUsername(prop.getProperty("username"))
		.enterPassword(prop.getProperty("password"))
		.clickLoginButton()
		.clickCrmsfaLink()
		.clickLeadButton()
		.clickCreateLead()
		.enterCompanyName(CName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickCreateLeadButton()
		.viewFirstName();
		

	}
	
	

}

package testcases;

import org.testng.annotations.Test;

import base.LeafTabMethod;
import pages.LoginPage;

public class LoginPom extends LeafTabMethod{
	@Test
	public void loginExe() {
		
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername(prop.getProperty("username"))
		.enterPassword(prop.getProperty("password"))
		.clickLoginButton();

	}

}

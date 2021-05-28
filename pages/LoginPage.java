package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.LeafTabMethod;

public class LoginPage extends LeafTabMethod  {
	
	public LoginPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	//method name-action+name of the element
	public LoginPage enterUsername(String userN) {
		driver.findElement(By.id("username")).sendKeys(userN);
		return this;//to stay in same page "this" is used

	}
	
	public LoginPage enterPassword(String passW) {
		
		driver.findElement(By.id("password")).sendKeys(passW);
		return this;

	}
	public HomePage clickLoginButton() {
		
		driver.findElement(By.className("decorativeSubmit")).click();
		//HomePage hp=new HomePage();//when ever going to new page object is created
		return new HomePage(driver); 

	}

}

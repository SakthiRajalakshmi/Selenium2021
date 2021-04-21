package week2.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");	
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Contacts").click();
		driver.findElementByLinkText("Create Contact").click();
		driver.findElementById("firstNameField").sendKeys("Sakthi");
		driver.findElementById("lastNameField").sendKeys("M");
		driver.findElementById("createContactForm_firstNameLocal").sendKeys("Avira");
		driver.findElementById("createContactForm_lastNameLocal").sendKeys("V");
		driver.findElementById("createContactForm_departmentName").sendKeys("sales");
		driver.findElementById("createContactForm_description").sendKeys("Sales Related");
		driver.findElementById("createContactForm_primaryEmail").sendKeys("a@gmail.com");
		
		WebElement source = driver.findElementById("createContactForm_generalStateProvinceGeoId");
		Select dropdown=new Select(source);
		dropdown.selectByVisibleText("New York");
		
		driver.findElementByClassName("smallSubmit").click();
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateContactForm_description").clear();
		driver.findElementById("updateContactForm_importantNote").sendKeys("cleared");
		driver.findElementByXPath("//input[@value='Update']").click();
		String title=driver.getTitle();
		System.out.println(title);
		
		
		
		
		
		
		
	}

}

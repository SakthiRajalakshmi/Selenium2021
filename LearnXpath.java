package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpath {

	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();//Driver setup
		ChromeDriver driver=new ChromeDriver();//open the browser by creating objects
		driver.get("http://leaftaps.com/opentaps/control/main");//load the application by giving URL
		driver.manage().window().maximize();//maximize  the screen
		//driver.manage().window().minimize();
		Thread.sleep(2000);
		
		driver.findElementByXPath("//input[@class='inputLogin']").sendKeys("Demosalesmanager");
		driver.findElementByXPath("(//input[@class='inputLogin'])[2]").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//a[contains(text(),'CRM')]").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//a[text()='Create Lead']").click();
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("TCS");
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Sakthi");
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("M");
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		
		
		
		
		//driver.close();//close the driver
		
		 	
		

	}

}

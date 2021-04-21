package week2.assignments;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByName("phoneNumber").sendKeys("11");
		driver.findElementByXPath("//button[text()='Find Leads']/..").click();

		// driver.findElementByXPath("Find Leads").click();
		Thread.sleep(2000);

		String id = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
				.getText();
		System.out.println(id);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		driver.findElementByLinkText("Delete").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(id);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		// driver.findElementByXPath("(//div[@class='x-panel-header
		// x-unselectable'])[6]")
		
		Thread.sleep(2000);
		String verify = driver.findElementByClassName("x-paging-info").getText();
		System.out.println(verify);
		driver.close();
		

	}

}

package week4.assignment;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContacts {

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
		driver.findElement(By.linkText("Merge Contacts")).click();
		driver.findElement(By.xpath("(//img[@alt=\"Lookup\"])[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> handleList=new ArrayList<String>(windowHandles);
		String secondHandle=handleList.get(1);
		driver.switchTo().window(secondHandle);
		driver.findElement(By.xpath("(//div[@class=\"x-grid3-cell-inner x-grid3-col-partyId\"]/a)[1]")).click();
		//driver.close();
		driver.switchTo().window(handleList.get(0));
		
		
		
		driver.findElement(By.xpath("(//img[@alt=\"Lookup\"])[2]")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		ArrayList<String> handleList1=new ArrayList<String>(windowHandles1);
		String secondHandle1=handleList1.get(1);
		driver.switchTo().window(secondHandle1);
		driver.switchTo().window(secondHandle1);
		driver.findElement(By.xpath("(//div[@class=\"x-grid3-cell-inner x-grid3-col-partyId\"]/a)[2]")).click();
		//driver.close();
		driver.switchTo().window(handleList1.get(0));
		driver.findElement(By.className("buttonDangerous")).click();
		driver.switchTo().alert().accept();
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		
	

	}

}

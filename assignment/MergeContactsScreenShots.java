package week4.assignment;

import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContactsScreenShots {

	public static void main(String[] args) throws IOException {
		Date date=new Date();
		String dateStr=date.toString();
		String dateStrin=dateStr.replaceAll(":","-");
		
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
		WebElement shot = driver.findElement(By.xpath("(//img[@alt=\"Lookup\"])[2]"));
		File source=shot.getScreenshotAs(OutputType.FILE);
		File target=new File("./snaps/shot_"+dateStrin+".png");
		FileUtils.copyFile(source, target);
		
		
		
		
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

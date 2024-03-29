package testcase;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import week5.day1.ReadExcel;

public class DuplicateLead extends BaseClass {
	@Test(dataProvider = "sendData", enabled = false)
	public void runDuplicateLead(String mobileNo) throws InterruptedException {
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(mobileNo);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.name("submitButton")).click();
	}
	/*
	 * @DataProvider public String[][] sendData() throws IOException{
	 * 
	 * String[][] data=new String[2][3];
	 * 
	 * data[0][0]="TestLeaf"; data[0][1]="Sakthi"; data[0][2]="M";
	 * 
	 * data[1][0]="TCS"; data[1][1]="Hari"; data[1][2]="R";
	 * 
	 * //instead of above hardcoded values we go for the below method
	 * 
	 * 
	 * ReadExcel re =new ReadExcel(); String[][]
	 * excelData=re.excelData("DuplicateLead"); return excelData;
	 * 
	 * 
	 * }
	 */}

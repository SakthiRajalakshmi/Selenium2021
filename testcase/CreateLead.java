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

public class CreateLead extends BaseClass {

	@Test(dataProvider = "sendData")
	public void runCreateLead(String company, String fName, String lName) {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
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
	 * excelData=re.excelData("CreateLead"); return excelData;
	 * 
	 * 
	 * }
	 */

}

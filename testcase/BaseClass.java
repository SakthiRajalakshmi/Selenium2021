package testcase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import week5.day1.ReadExcel;

public class BaseClass {
	
	public ChromeDriver driver;
@Parameters({"url","userName","password"})	
@BeforeMethod
	public void precondition(String url,String uName,String pWord) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pWord);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		
		

	}
@DataProvider
public String[][] sendData() throws IOException{
		
	 
	 ReadExcel re =new ReadExcel();
	 String name=this.getClass().getSimpleName();
	 String[][] excelData=re.excelData(name);
	 
	 return excelData;
	
	
}
	 

@AfterMethod
public void postcondition() {
	driver.close();
	
	
	
	
	
	
}
}



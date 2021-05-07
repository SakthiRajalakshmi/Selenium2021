package week4.assignment;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNow {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev111627.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//login itself inside frame
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("admin");
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("India@123");
		driver.findElement(By.xpath("//button[@id=\"sysverb_login\"]")).click();
		Thread.sleep(5000);
		//Search “incident “ Filter Navigator
		driver.findElement(By.xpath("//input[@id=\"filter\"]")).sendKeys("incident",Keys.ENTER);
		driver.findElement(By.xpath("(//div[text()='All'])[2]")).click();
		Actions builder=new Actions(driver);
		//driver.switchTo().defaultContent();
		//Click New button-which is inside frame
	
		driver.switchTo().frame("gsft_main");
		//Thread.sleep(2000);
		WebElement new1 = driver.findElement(By.xpath("//button[@id=\"sysverb_new\"]"));
		builder.moveToElement(new1).click().perform();
		//driver.switchTo().frame("gsft_main");-caller id is in the same frame
		driver.findElement(By.xpath("//input[@id='sys_display.incident.caller_id']")).click();
		driver.findElement(By.xpath("//span[@class=\"icon icon-search\"]")).click();
		//new window opens
		Set<String> windowHandles=driver.getWindowHandles();
		ArrayList<String> handle=new ArrayList<String>(windowHandles);
		String secondWindow=handle.get(1);
		driver.switchTo().window(secondWindow);
		driver.findElement(By.xpath("//a[text()=\"Abel Tuter\"]")).click();
		driver.switchTo().window(handle.get(0));
	
		Thread.sleep(2000);
		//after closing the window , we are coming back to frame page to select short description
		driver.switchTo().frame("gsft_main");
		WebElement short1 = driver.findElement(By.id("incident.short_description"));
		builder.click(short1).perform();
		driver.findElement(By.id("lookup.incident.short_description")).click();
		//new window opens
		Set <String> windowHandle1=driver.getWindowHandles();
		ArrayList<String> handle1=new ArrayList<String>(windowHandle1);
		String second=handle1.get(1);
		driver.switchTo().window(second);
		driver.findElement(By.xpath("//a[text()=\"Issue with email\"]")).click();
		driver.switchTo().window(handle1.get(0));
		//again switching back to frame
		
		driver.switchTo().frame("gsft_main");
		String incNum = driver.findElement(By.xpath("//input[@id=\"incident.number\"]")).getAttribute("value");
		driver.findElement(By.xpath("//button[@id=\"sysverb_insert\"]")).click();
		//driver.switchTo().defaultContent();-without using default it works
		
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(incNum,Keys.ENTER);
		String text = driver.findElementByXPath("//a[@class='linked formlink']").getText();
		if (text.equals(incNum))

			System.out.println("Incident has been created");
		else
			System.out.println("Incident not created");
	
		
		

	}

}

package servicenow.pages;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.beust.jcommander.JCommander.Builder;

import base.ServiceNowWindow;

public class UpdateStatePage extends ServiceNowWindow {
	public UpdateStatePage(ChromeDriver driver) {
		this.driver=driver;
		

	}
	
	public Set<String> windowHandles;
	public ArrayList<String> handle;
	public String secondWindow;
	JavascriptExecutor executor=(JavascriptExecutor)driver;
	
	public UpdateStatePage stateUpdatSelect() {
		
		WebElement source = driver.findElement(By.xpath("//select[@id=\"incident.state\"]"));
		Select dropdown=new Select(source);
		dropdown.selectByIndex(3);
		return this;

	}
	
	public ResolveStatePage updateUrgeState() {
		WebElement state = driver.findElement(By.id("incident.state"));
		Select dropdownSt=new Select(state);
		dropdownSt.selectByIndex(1);
		WebElement urgency = driver.findElement(By.id("incident.urgency"));
		Select dropdownur=new Select(urgency);
		dropdownur.selectByIndex(0);
		
		driver.findElement(By.id("sysverb_update")).click();
		return new ResolveStatePage(driver);
		

	}
	public ResolveStatePage updateCategoryWorkNote() {
		
		WebElement cate = driver.findElement(By.id("incident.category"));
		Select category=new Select(cate);
		category.selectByIndex(2);
		
		
		WebElement note = driver.findElement(By.xpath("//span[text()='Notes']"));
		Actions builder=new Actions(driver);
		
		builder.moveToElement(note).click().perform();
		
		
		//driver.switchTo().frame("gsft_main");
		/*
		 * windowHandles=driver.getWindowHandles(); handle=new
		 * ArrayList<String>(windowHandles); secondWindow=handle.get(0);
		 * driver.switchTo().window(secondWindow);
		 */
		WebElement notes = driver.findElement(By.id("activity-stream-textarea"));
		builder.moveToElement(notes).click().perform();
		driver.findElement(By.id("activity-stream-textarea")).sendKeys("notes written");
		driver.findElement(By.id("sysverb_update")).click();
		
		return new ResolveStatePage(driver);

	}
	public ResolveStatePage resolutionSetting() {
		
		driver.findElement(By.xpath("//span[text()=\"Resolution Information\"]")).click();
		WebElement resolution = driver.findElement(By.xpath("//select[@id=\"incident.close_code\"]"));
		Select dropdown1=new Select(resolution);
		dropdown1.selectByValue("Closed/Resolved by Caller");
		
		driver.findElement(By.id("sysverb_update")).click();
		//Actions builder=new Actions(driver);
		/*
		 * WebElement re =
		 * driver.findElement(By.xpath("//textarea[@mandatory='false']"));
		 * executor.executeScript("arguments(0).click", re);
		 * //builder.moveToElement(re).perform(); driver.findElement(By.
		 * xpath("//label[text()='Resolution notes']/following::textarea")).sendKeys(
		 * "resolved");
		 * driver.findElement(By.xpath("(//button[text()=\"Update\"])[2]")).click();
		 */
		
		return new ResolveStatePage(driver);

	}

}

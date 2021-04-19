package week2.day1;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.beust.jcommander.Strings;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownAssignments {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement source1 = driver.findElementById("dropdown1");
		Select dropdown1=new Select(source1);
		dropdown1.selectByIndex(2);
		
		WebElement source2 = driver.findElementByName("dropdown2");
		Select dropdown2=new Select(source2);
		dropdown2.selectByVisibleText("Appium");
		
		WebElement source3 = driver.findElementByName("dropdown3");
		Select dropdown3=new Select(source3);
		dropdown3.selectByValue("4");

		
		WebElement source4 = driver.findElementByClassName("dropdown");
		Select dropdown4=new Select(source4);
		List<WebElement> options = dropdown4.getOptions();
		int dropdownsize=options.size();
		System.out.println("Dropdown option size" +dropdownsize);
		
	    driver.findElementByXPath("(//option[text()='Appium'])[5]/..").sendKeys("Appium");
		
		
		
		
		
		
	}

}

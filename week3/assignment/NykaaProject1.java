package week3.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NykaaProject1 {
	
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElementByName("search-suggestions-nykaa").sendKeys("Perfumes");
		driver.findElementByName("search-suggestions-nykaa").sendKeys(Keys.ENTER);
        WebElement shade = driver.findElementByXPath("//button[@class='primary-btn common-btn ']"); 
        executor.executeScript("arguments[0].click();", shade);
		
		WebElement add = driver.findElementByXPath("//button[starts-with(@class,'nk-btn combo-add-to-btn')]");
		executor.executeScript("arguments[0].click();", add);
		driver.findElementById("SearchInputBox").sendKeys("Sunglasses");
		driver.findElementById("SearchInputBox").sendKeys(Keys.ENTER);
		WebElement sunadd = driver.findElementByXPath("(//span[text()='Enrico Blue Polycarbonate Wayfarer Amanzi Unisex Sunglasses']/following::button)[5]");
		executor.executeScript("arguments[0].click();", sunadd);
		WebElement addbag = driver.findElementByClassName("BagItems");
		executor.executeScript("arguments[0].click();", addbag);
		System.out.println(driver.findElementByXPath("//div[text()='Enrico Walferty Transparent UV protected Polarized Aviator M...']").isDisplayed());
		WebElement proceed = driver.findElementByXPath("//button[@class='btn full fill no-radius proceed ']");
		executor.executeScript("arguments[0].click();", proceed);
		
		String grand = driver.findElementByXPath("//div[@class='value']").getText().replaceAll("\\D","");
		System.out.println(grand);
		
		
		
	}

		
	

}

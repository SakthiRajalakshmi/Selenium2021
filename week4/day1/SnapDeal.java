package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.snapdeal.com/");
		WebElement mensFasion = driver.findElementByXPath("(//span[@class=\"catText\"][text()=\"Men's Fashion\"])");
		Thread.sleep(2000);
		Actions builder=new Actions(driver);
		builder.moveToElement(mensFasion).click().perform();
		
		WebElement bag = driver.findElementByXPath("//span[@class=\"linkTest\"][text()=\"Backpacks\"]");
		Thread.sleep(2000);
		builder.moveToElement(bag).click().perform();
		
		driver.findElementByXPath("//input[@placeholder=\"Enter your pincode\"]").sendKeys("600042");
		driver.findElementByXPath("//button[@class=\"pincode-check\"]").click();
		
		WebElement img = driver.findElement(By.xpath("//img[@class='product-image ']"));
		 Thread.sleep(2000);
		WebElement quick = driver.findElementByXPath("//div[contains(@class,'center quick-view-bar')]");
	   
		builder.moveToElement(img).click(quick).perform();
		

	}

}

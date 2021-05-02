package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lens {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		
		
		driver.get("https://www.lenskart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement comp = driver.findElement(By.xpath("//a[text()=\"Computer Glasses\"]"));
		Actions builder=new Actions(driver);
		builder.moveToElement(comp).click(comp).perform();
		
		WebElement men = driver.findElement(By.xpath("//div[@id='cssmenu']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
		
		Thread.sleep(2000);
		WebElement premium = driver.findElement(By.xpath(("((//a[contains(text(),'SELECT CATEGORY')])[3]/following::span)[3]")));
		
		builder.moveToElement(men).click(premium).perform();
		
		WebElement filter = driver.findElement(By.xpath("//div[@class=\"dropdown second-filter-dropdown\"]"));
		WebElement round = driver.findElement(By.xpath("//span[text()='Black(53)']/preceding::div[text()='FRAME SHAPE']"));
		Thread.sleep(2000);
		builder.moveToElement(filter).click(round).perform();
		
		
		driver.findElement(By.xpath("//span[text()='Black(53)']/preceding::div[1]")).click();
		
		
	}

}

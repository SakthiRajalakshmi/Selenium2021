package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectItems {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		WebElement sel = driver.findElement(By.xpath("(//option[text()=\"Selenium\"])[6]"));
		WebElement app = driver.findElement(By.xpath("(//option[text()=\"Appium\"])[6]"));
		WebElement uft = driver.findElement(By.xpath("(//option[text()=\"UFT/QTP\"])[6]"));
		
		Actions builder=new Actions(driver);
		builder.clickAndHold(sel).moveToElement(app).moveToElement(uft).release().perform();
		
		

	}

}

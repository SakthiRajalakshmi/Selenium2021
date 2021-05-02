package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectAction {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/selectable.html");
		driver.manage().window().maximize();
		WebElement driver1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement driver3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement driver5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
		
		Actions builder=new Actions(driver);
		builder.keyDown(Keys.CONTROL).click(driver1).click(driver3).click(driver5).keyUp(Keys.CONTROL).perform();
		
		

	}

}

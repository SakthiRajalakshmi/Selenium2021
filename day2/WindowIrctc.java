package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowIrctc {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions builder=new Actions(driver);
		Thread.sleep(5000);
		WebElement submit = driver.findElement(By.xpath("(//button[@type=\"submit\"])[1]"));
		builder.click(submit).perform();
		WebElement figh = driver.findElement(By.className("iconsection"));
		
		
		WebElement flight = driver.findElement(By.xpath("//span[@class=\"allcircle circleone\"]"));
		builder.moveToElement(figh).click(flight).perform();
		Set<String> handles = driver.getWindowHandles();
		List<String> handleList=new ArrayList<String>(handles);
		String secondHandle=handleList.get(1);
		driver.switchTo().window(secondHandle);
		WebElement but = driver.findElement(By.xpath("//button[text()=\"Ok\"]"));
		builder.click(but).perform();
		System.out.println(driver.findElement(By.xpath("//a[text()=\" flights@irctc.co.in\"]")).getText());
		driver.switchTo().window(handleList.get(0));
		driver.close();
		

		
		

	}

}

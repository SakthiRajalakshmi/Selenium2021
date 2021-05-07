package week4.assignment;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()=\"Open Home Page\"]")).click();
		Set<String> windowHandle= driver.getWindowHandles();
		ArrayList<String> handle=new ArrayList<String>(windowHandle);
		String secondWindow=handle.get(1);
		driver.switchTo().window(secondWindow);
		driver.findElement(By.xpath("//img[@alt=\"Buttons\"]")).click();

		driver.switchTo().window(handle.get(0));
		System.out.println(driver.getTitle());
		driver.close();
	
		
		
		
		
		

	}

}

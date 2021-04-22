package week2.assignments;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownQues {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement source1 = driver.findElementById("dropdown1");
		Select dropdown1=new Select(source1);
		List<WebElement> options = dropdown1.getOptions();
		int ddSize=options.size();
		dropdown1.selectByIndex(ddSize-2);
		
		

	}

}

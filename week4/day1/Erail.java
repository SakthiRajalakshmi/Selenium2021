package week4.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<String> trainNames = new ArrayList<String>();
		
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("ms",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("mdu",Keys.TAB);
		driver.findElementByXPath("//input[@id=\"chkSelectDateOnly\"]").click();
		List<WebElement> name = driver.findElementsByXPath("//table[@class=\"DataTable TrainList TrainListHeader\"]//tr/td[2]");
		
		for (WebElement trainname : name) {
			
			trainNames.add(trainname.getText());
			System.out.println(trainNames);
			
			
			
		}
		Set<String> dupTrain = new HashSet<String>(trainNames);
		System.out.println(dupTrain);
		if(dupTrain.size()==trainNames.size())
			
			System.out.println("No duplicate Names");
		else
			System.out.println("duplicate Names available");
		
	

	}

}

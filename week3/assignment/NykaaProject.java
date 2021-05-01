package week3.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NykaaProject {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByName("search-suggestions-nykaa").sendKeys("Perfumes");
		driver.findElementByName("search-suggestions-nykaa").sendKeys(Keys.ENTER);

		List<WebElement> values = driver.findElementsByXPath("//div[@class='m-content__product-list__title']/h2");
		for (WebElement newValues : values) {

			System.out.println(newValues.getAttribute("title"));

		}
		List<WebElement> pay = driver.findElementsByXPath("//span[@class='post-card__content-price-offer']");

		for (WebElement price : pay) {

			System.out.println(price.getText().replaceAll("\\D", ""));

		}

		driver.findElementByXPath("//button[@class='primary-btn common-btn ']").click();

		driver.findElementByXPath("//button[starts-with(@class,'nk-btn combo-add-to-btn')]").click();

		driver.findElementById("SearchInputBox").sendKeys("Sunglasses");
		driver.findElementById("SearchInputBox").sendKeys(Keys.ENTER);

		List<WebElement> sunglass = driver.findElementsByXPath("//div[@class='m-content__product-list__title']/h2");
		for (WebElement name : sunglass)

		{
			System.out.println(name.getAttribute("title"));

		}

		List<WebElement> sunprice = driver.findElementsByXPath("//span[@class='post-card__content-price-offer']");

		for (WebElement sprice : sunprice) {

			System.out.println(sprice.getText().replaceAll("//D",""));

		}

	}

}

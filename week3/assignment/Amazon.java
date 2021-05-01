package week3.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<Integer> finPrice = new ArrayList<Integer>();
		List<String> priceP = new ArrayList<String>();
		List<String> finName = new ArrayList<String>();

		driver.findElementById("twotabsearchtextbox").sendKeys("Redmi mobiles", Keys.ENTER);
		List<WebElement> name = driver.findElementsByXPath(
				"//div[@data-component-type='s-search-result']//span[contains(@cel_widget_id,'MAIN-SEARCH_RESULTS')]/div[contains(@class,'-latency-cf-section')]//span[@class=\"a-size-medium a-color-base a-text-normal\"]");
		for (WebElement mobname : name) {

			String sr = mobname.getText();
			finName.add(sr);
			System.out.println(finName);

		}
		List<WebElement> price = driver.findElementsByXPath(
				"//div[@data-component-type='s-search-result']//span[contains(@cel_widget_id,'MAIN-SEARCH_RESULTS')]/div[contains(@class,'-latency-cf-section')]//span[@class='a-price-whole']");
		for (WebElement mobprice : price) {

			String pr = mobprice.getText().replace(",", "");
			int x = Integer.valueOf(pr);
			finPrice.add(x);

			System.out.println(finPrice);
		}

		Collections.sort(finPrice);
		System.out.println(finPrice);

		int m = finPrice.size();
		System.out.println(finPrice.get(m - 1));

	}

}

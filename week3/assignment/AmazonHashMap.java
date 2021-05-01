package week3.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonHashMap {

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
		
		List<WebElement> price = driver.findElementsByXPath(
				"//div[@data-component-type='s-search-result']//span[contains(@cel_widget_id,'MAIN-SEARCH_RESULTS')]/div[contains(@class,'-latency-cf-section')]//span[@class='a-price-whole']");
		String product_name;
		String product_price;
		int int_product_price;
		HashMap<Integer,String> map_final_products = new HashMap<Integer,String>();
		for(int i=0;i<name.size();i++) {
			product_name=name.get(i).getText();
			product_price=price.get(i).getText().replaceAll(",","");
			int_product_price=Integer.parseInt(product_price);
			map_final_products.put(int_product_price,product_name);
		}
		
		
		

		Collections.sort(finPrice);
		System.out.println(finPrice);

		int m = finPrice.size();
		System.out.println(finPrice.get(m - 1));



	}

}

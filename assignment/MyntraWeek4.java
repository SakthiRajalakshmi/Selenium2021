package week4.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyntraWeek4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions builder=new Actions(driver);
		/*
		 * //2) Mouse over on WOMEN 3) Click Jackets & Coats 4) Find the total count of
		 * item
		 */ 
		WebElement women = driver.findElement(By.xpath("//a[text()=\"Women\"]"));
		WebElement jacCoat = driver.findElement(By.xpath("//a[text()=\"Jackets & Coats\"]"));
		
		builder.moveToElement(women).click(jacCoat).perform();
		Thread.sleep(3000);
		String count = driver.findElement(By.xpath("//span[@class=\"title-count\"]")).getText().replaceAll("\\D","");
		String jackets = driver.findElement(By.xpath("(//span[@class=\"categories-num\"])[1]")).getText().replaceAll("\\D","");
		Thread.sleep(2000);
		//Validate the sum of categories count matches
		String coats = driver.findElement(By.xpath("(//span[@class=\"categories-num\"])[2]")).getText().replaceAll("\\D","");
		int k=Integer.parseInt(count);
		int i=Integer.parseInt(jackets);
		int j=Integer.parseInt(coats);
		int tot=i+j;
		if(tot==k)
			System.out.println("The sum Matches");
		else
			System.out.println("Sum is not matching ");
		/*
		 * 6) Check Coats 7) Click + More option under BRAND 8) Type MANGO and click
		 * checkbox 9) Close the pop-up x
		 */		
		driver.findElement(By.xpath("(//div[@class=\"common-checkboxIndicator\"])[2]")).click();
		WebElement fil = driver.findElement(By.xpath("//div[@class=\"vertical-filters-filters brand-container\"]"));
		WebElement brand = driver.findElement(By.className("brand-more"));
		builder.moveToElement(fil).click(brand).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\"Search brand\"]")).sendKeys("MANGO");
		driver.findElement(By.xpath("//label[@class=\" common-customCheckbox\"]/div")).click();
		Thread.sleep(2000);
		WebElement close = driver.findElement(By.xpath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']"));
		builder.click(close).perform();
		String mango = driver.findElement(By.xpath("(//div[@class=\"filter-summary-filter\"])[2]")).getText();
		System.out.println(mango);
		//Confirm all the Coats are of brand MANGO
		String x="MANGO";
		if(x.equals(mango))
			System.out.println("All Brands are Mango");
		else
			System.out.println("Brand Mismatch");
		
		//Sort by Better Discount
		String store;
		List<Integer> disPrice = new ArrayList<Integer>();
		WebElement disc = driver.findElement(By.xpath("//ul[@class=\"discount-list\"]//label"));
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class=\"discount-list\"]//label"));
		for (WebElement dis : list) {
			store=dis.getText().replaceAll("\\D","");
			int s=Integer.parseInt(store);
			disPrice.add(s);
		}
		Collections.sort(disPrice);
		System.out.println(disPrice);
		int high_Dis=disPrice.get(disPrice.size()-1);
		System.out.println(high_Dis);
		String chk;
		int chk_int;
		for(int v=0;v<list.size();v++)
		{
			chk=list.get(v).getText().replaceAll("\\D","");
			chk_int=Integer.parseInt(chk);
			Thread.sleep(2000);
			if(chk_int==high_Dis)
			{
				List<WebElement> discount = driver.findElements(By.xpath("//ul[@class=\"discount-list\"]//label/input"));
			    //discount.get(v);
			    builder.moveToElement(discount.get(v)).click().perform();
			}
				
		}
		
		/*
		 * 12) Find the price of first displayed item 13) Mouse over on size of the
		 * first item 14) Click on WishList Now
		 */
	
		String price1 = driver.findElement(By.xpath("//span[@class=\"product-discountedPrice\"]")).getText();
		System.out.println(price1);
		WebElement wish1 = driver.findElement(By.xpath("//span[@class=\"product-discountedPrice\"]"));
		WebElement wish = driver.findElement(By.xpath("//span[@class=\"product-wishlistFlex product-actionsButton product-wishlist \"]"));
		builder.moveToElement(wish1).click(wish).perform();
		}
	
			
			
		
			
	}



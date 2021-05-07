package week4.assignment;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NykaaWeek4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.nykaa.com/");
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions builder=new Actions(driver);
		Thread.sleep(2000);
		
		/*
		 * 2) Mouseover on Brands and Mouseover on Popular 3) Click L'Oreal Paris 4) Go
		 * to the newly opened window and check the title contains L'Oreal Paris
		 */		
		
		WebElement brand = driver.findElement(By.xpath("//a[text()=\"brands\"]"));
		builder.moveToElement(brand).perform();
		WebElement pop = driver.findElement(By.xpath("//a[text()=\"Popular\"]"));
		builder.moveToElement(pop).perform();
		
		WebElement lol = driver.findElement(By.xpath("//img[@src='https://adn-static2.nykaa.com/media/wysiwyg/2019/lorealparis.png']"));
		
		builder.click(lol).perform();
		
		// Go to the newly opened window and check the title contains L'Oreal Paris
		Set<String> windowHandles=driver.getWindowHandles();
		ArrayList<String> handles=new ArrayList<String>(windowHandles);
		String secondHandle=handles.get(1);
		driver.switchTo().window(secondHandle);
		String title1 = driver.getTitle();
		System.out.println(title1);
		Thread.sleep(5000);
		
		/*
		 * Click sort By and select customer top rated 6) Click Category and click
		 * Shampoo 7) check whether the Filter is applied with Shampoo 8) Click on
		 * L'Oreal Paris Colour Protect Shampoo
		 */		
		
		WebElement sort = driver.findElement(By.xpath("//div[@class='sort-btn clearfix']"));
		WebElement arrow = driver.findElement(By.xpath("//i[@class='fa fa-angle-down']"));
		WebElement cus = driver.findElement(By.xpath("//div[@for='3']//div[1]"));
		builder.moveToElement(sort).click(arrow).click(cus).perform();
		Thread.sleep(2000);
		WebElement cate = driver.findElement(By.xpath("//div[text()='Category']"));
		builder.moveToElement(cate).click().perform();
		WebElement hair = driver.findElement(By.xpath("//div[@class='category-wrap-top']//li"));
		builder.moveToElement(hair).click().perform();
		WebElement hairCare = driver.findElement(By.xpath("//span[text()='Hair Care']"));
		builder.moveToElement(hairCare).click().perform();
		WebElement shampoo = driver.findElement(By.xpath("//div[@class='control__indicator']"));
		builder.click(shampoo).perform();
		String sham = driver.findElement(By.xpath("(//li[text()='Shampoo'])[1]")).getText();
		System.out.println(sham);
		Thread.sleep(2000);
		WebElement protect = driver.findElement(By.xpath("//div[@id='listingContainer']/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[10]/div[1]"));
		builder.moveToElement(protect).click(protect).perform();
		Thread.sleep(4000);
		//GO to the new window and select size as 175ml
		
		Set<String> windowHandles1=driver.getWindowHandles();
		ArrayList<String> handles1=new ArrayList<String>(windowHandles1);
		String secondHandle1=handles1.get(2);
		driver.switchTo().window(secondHandle1);
		Thread.sleep(5000);
		WebElement siz = driver.findElement(By.xpath("(//span[@class=\"size-pallets\"])[2]"));
		builder.moveToElement(siz).perform();
		/*
		 * 10) Print the MRP of the product 11) Click on ADD to BAG 12) Go to Shopping
		 * Bag 13) Print the Grand Total amount
		 */
		
		String mrp = driver.findElement(By.xpath("(//span[@class=\"post-card__content-price-offer\"])[1]")).getText();
		System.out.println("the product MRP is"+mrp);
		driver.findElement(By.xpath("//button[@class=\"combo-add-to-btn prdt-des-btn js--toggle-sbag nk-btn nk-btn-rnd atc-simple m-content__product-list__cart-btn  \"]")).click();
		WebElement addTo = driver.findElement(By.xpath("//div[@class=\"AddBagIcon\"]"));
		builder.click(addTo).perform();
		String grand = driver.findElement(By.xpath("(//div[@class=\"value\"])[4]")).getText().replaceAll("\\D","");
		System.out.println("grand total"+grand);
		Thread.sleep(2000);
		//click proceed
		WebElement proceed = driver.findElement(By.xpath("//button[@class=\"btn full fill no-radius proceed \"]"));
		//builder.click(proceed).perform();
		executor.executeScript("arguments[0].click();", proceed);
		
		/*
		 * 15) Click on Continue as Guest 16) Check if this grand total is the same in
		 * step 13 17) Close all windows
		 */
		
		WebElement guest = driver.findElementByXPath("//button[@class='btn full big']");
		executor.executeScript("arguments[0].click();", guest);
		String grandTot = driver.findElement(By.xpath("(//div[@class=\"value\"])[2]")).getText().replaceAll("\\D","");
		if(grandTot.equals(grand))
			System.out.println("The grand total is same");
		else
			System.out.println("its different");
		
		

	}

}

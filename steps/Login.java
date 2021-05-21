package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends BaseClass {
	
	
	@Given("Open the chrome browser")
	public void openTheBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		

	}
	@Given("Load application URL")
	public void loadApplicationURL () {
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

	}
	@Given("Enter the username as {string}")
	public void enterUserName(String uName) {
		
		driver.findElement(By.id("username")).sendKeys(uName);

	}
	@Given("Enter the password as {string}")
	public void enterPassword(String pName) {
		driver.findElement(By.id("password")).sendKeys(pName);
	}
	@When("Click on login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}
	@Then("HomePage should be displayed")
	public void homePageDisplayed() {
		System.out.println("HomePage Displayed");

	}
	@But("Error should be displayed")
	public void errorDisplayed() {
		System.out.println("Error Displayed");

	}

}

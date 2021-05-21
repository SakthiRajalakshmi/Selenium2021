package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadCucumber extends BaseClass {
	

	

	/*
	 * @When("Click the CRMSFA") public void crm_sfa() {
	 * driver.findElement(By.linkText("CRM/SFA")).click();
	 * 
	 * 
	 * }
	 * 
	 * @Then("Expected page to be displayed") public void correctPage() {
	 * System.out.println("Expected page displayed");
	 * 
	 * }
	 * 
	 * @When("Click the leads") public void leads() {
	 * 
	 * driver.findElement(By.linkText("Leads")).click();
	 * 
	 * }
	 * 
	 * @Then("Expected page should be displayed") public void exp() {
	 * System.out.println("Leads page displayed"); }
	 */	@When("Click the CreateLead link")
	public void clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();

	}
	@Then("CreateLead page displayed")
	public void createLeadDisplayed() {
		System.out.println("CreateLead Displayed");

	}
	@Given("Enter the company Name as {string}")
	public void enterCompanyName(String cName) {
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);

	}
	@Given("Enter the first Name as {string}")
	public void enterFirstName(String fName) {
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	}
	@Given("Enter the last Name as {string}")
	public void enterLastName(String lName) {
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	}
	@When("Click submit button")
	public void clickSubmitLead() {
		driver.findElement(By.name("submitButton")).click();
	}
	@Then("Lead is created")
	public void leadCreated() {
		System.out.println("New Lead Created");

	}
	
	

	



}

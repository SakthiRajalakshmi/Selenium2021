package steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MergeLeadCucumber extends BaseClass {

	String mergeLeadID;

	/*
	 * Set<String> allWindows = driver.getWindowHandles(); List<String> allhandles =
	 * new ArrayList<String>(allWindows);
	 * 
	 * 
	 * Set<String> allWindows2 = driver.getWindowHandles(); List<String> allhandles2
	 * = new ArrayList<String>(allWindows2);
	 */
	
	Set<String> allWindows;
	List<String> allhandles;
	Set<String> allWindows2;
	List<String> allhandles2;
	

	@When("MergeLeads clicked")
	public void mergeLeadsClicked() {
		driver.findElement(By.linkText("Merge Leads")).click();
		
	}

	@When("Image is clicked")
	public void imageIsClicked() {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
	}

	@When("New Window1 Opens")
	public void newWindow1Opens() {

		allWindows=driver.getWindowHandles();
		allhandles = new ArrayList<String>(allWindows);

		driver.switchTo().window(allhandles.get(1));
	}

	@Given("FirstName for MergeLead as {string}")
	public void firstNameForMergeLeadAsSakthi(String fiName) {

		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fiName);

	}

	@When("Click MergeLead1 Find Leads")
	public void clickMergeLead1FindLeads() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}

	@Then("Get the Name of the First Lead")
	public void getTheNameOfTheFirstLead() throws InterruptedException {
		Thread.sleep(1000);
		mergeLeadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
				.getText();
	}

	@When("The first Lead Clicked")
	public void theFirstLeadClicked() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}

	@Then("Switch to the Merge Window")
	public void switchToTheMergeWindow() {
		driver.switchTo().window(allhandles.get(0));
	}

	@When("Image2 is clicked")
	public void image2IsClicked() {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	}

	@When("New Window2 Opens")
	public void newWindow2Opens() {

		allWindows2 = driver.getWindowHandles();
		allhandles2 = new ArrayList<String>(allWindows2);
		System.out.println("============================="+ allhandles2.size());

		driver.switchTo().window(allhandles2.get(1));
	}

	@Given("FirstName for MergeLead1 as {string}")
	public void firstNameForMergeLead1AsFMName(String fMName) {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fMName);
	}

	@When("Click MergeLead2 Find Leads")
	public void clickMergeLead2FindLeads() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles2.get(0));

	}

	@When("Click Merge")
	public void clickMerge() {
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
	}

	@Then("Switch to the previous window")
	public void switchToThePreviousWindow() {
		driver.switchTo().alert().accept();

	}

	@When("Click FindLeads for Merge")
	public void clickFindLeadsForMerge() {
		driver.findElement(By.linkText("Find Leads")).click();
	}

	@Given("The LeadID")
	public void theLeadID() {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(mergeLeadID);

	}

	@When("Clicking the FindLeads Button")
	public void clickingTheFindLeadsButton() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}

	@Then("Validate the Page Information")
	public void validateThePageInformation() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	}

}

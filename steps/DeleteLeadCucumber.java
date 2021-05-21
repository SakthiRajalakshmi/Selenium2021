package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteLeadCucumber extends BaseClass {
	String leadID;
	@When("FindLeads clicked")
	public void findLeadsClicked() {
		
		driver.findElement(By.linkText("Find Leads")).click();
	    	}
	@When("Phone is clicked")
	public void phoneIsClicked() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	@Given("Enter the phone number as {string}")
	public void enterThePhoneNumberAs(String mobNo) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(mobNo);
	}
	@When("click FindLeads")
	public void clickFindLeads() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	@Then("Get the Lead ID")
	public void getTheLeadID() {
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
				.getText();
		System.out.println("The lead Id is" +leadID);
		}
	@When("Click first LeadID")
	public void clickFirstLeadID() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	@When("Delete the LeadID")
	public void deleteTheLeadID() {
		driver.findElement(By.linkText("Delete")).click();
	}
	@When("FindLeads clicked again")
	public void findLeadsClickedAgain() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@Given("Send the LeadID")
	public void sendTheLeadID() {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	}
	@When("Click the FindLeads button")
	public void clickTheFindLeadsButton() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	@Then("Check for Text displayed")
	public void checkForTextDisplayed() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	}

}

package week6.testng;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

public class RetryFailed {
	@Test
	public void createLead() {
		System.out.println("CreateLead");

	}
	@Test
	public void editLead() {
		System.out.println("EditLead");
		throw new NoSuchElementException(null);

	}


}

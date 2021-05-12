package week5.day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestTry2 {
  @Test
  public void SecondTry() {
	  System.out.println("Test2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BeforeMethod2");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AfterMethod2");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("BeforeClass2");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AfterClass2");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("BeforeTest2");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("AfterTest2");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BeforeSuite2");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("AfterSuite2");
  }

}

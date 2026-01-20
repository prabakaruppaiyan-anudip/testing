package testNGExercises;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest {
	
  @Test
  public void testMethod()
  {
	  System.out.println("This is test method");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is beforeMethod");
	  System.out.println("This will be executed before every test method");}
      

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is afterMethod");
	  System.out.println("This will be executed after every test method");
	  
  }


  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass will be executed before beforeMethod");
	  
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass will be executed after afterMethod");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest will be executed before beforeClass");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest will be executed after afterClass");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeSuite will be executed before running all");
	  
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite will be executed after running all");
  }

}

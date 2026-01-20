package testNGExercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SauceDemoApp {
	WebDriver driver;
	String app_url="https://www.saucedemo.com/";
	String expected_title="Swag Labs";
	String url_inventory="https://www.saucedemo.com/inventory.html";
  @BeforeClass
   public void launchBrowser()
   {
	   driver=new ChromeDriver();
	   driver.get(app_url);
	   if(driver.getTitle().equalsIgnoreCase(expected_title))
			System.out.println("Application launched successfully");
   }
    
	/*
	 * @Test public void appSuccessful() {
	 * if(driver.getTitle().equalsIgnoreCase(expected_title))
	 * System.out.println("Application launched successfully"); }
	 */
  @Test(dataProvider="credentials")
  public void login(String un, String pwd)
  {   
	  driver.get(app_url);
	  driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(un);
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
	  driver.findElement(By.xpath("//input[@id='login-button']")).click();
	  if(driver.getCurrentUrl().equals(url_inventory))
		  System.out.println("Logged in successfully");
  
  }
  @AfterClass
  public void closeApp()
  {
	  driver.close();
  }
  @DataProvider(name="credentials")
  public Object[][] getData()
  {
	  Object[][] data=new Object[3][2];
	  data[0][0]="standard_user";
	    data[0][1]="secret_sauce";
	    data[1][0]="locked_out_user";
	    data[1][1]="secret_sauce";
	    data[2][0]="error_user";
	    data[2][1]="secret_sauce";
	 return data; 
	  
  }
  
}

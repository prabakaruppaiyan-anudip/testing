package testNGExercises;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LaunchBrowserUsingParameter {
  WebDriver driver;
  @Test
  @Parameters({"browser"})
  public void launch(String b) {
	 if(b.equalsIgnoreCase("chrome"))
		 driver=new ChromeDriver();
	 else
		 driver=new FirefoxDriver();
	  
  }
  }


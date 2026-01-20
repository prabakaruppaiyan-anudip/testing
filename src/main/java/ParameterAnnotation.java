import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterAnnotation {
	WebDriver driver;
  @Test
  @Parameters({"browser"})
  public void f(String browser) {
	  
	  if(browser.equals("chrome"))
		  driver=new ChromeDriver();
	  else if(browser.equals("firefox"))
		  driver=new FirefoxDriver();
	  
  }
}

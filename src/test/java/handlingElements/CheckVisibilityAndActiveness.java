package handlingElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckVisibilityAndActiveness {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement search_box=driver.findElement(By.name("q"));
		if(search_box.isDisplayed()&&search_box.isEnabled())
			search_box.sendKeys("xpath options");

	}

}

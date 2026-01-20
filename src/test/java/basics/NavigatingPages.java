package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigatingPages {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		//launching application
		driver.get("https://cmis4.anudip.org/");
		Thread.sleep(2000);
		//launching application using navigate
		driver.navigate().to("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.33.0");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		

	}

}

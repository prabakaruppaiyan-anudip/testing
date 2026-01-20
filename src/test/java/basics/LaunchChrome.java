package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		//Launching Chrome browser
		WebDriver driver=new ChromeDriver();
		//Launching the application
		driver.get("http://www.google.com");
		

	}
}

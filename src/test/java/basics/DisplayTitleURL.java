package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayTitleURL {

	public static void main(String[] args) {
		//Launching Chrome browser
		WebDriver driver=new ChromeDriver();
		//Launching the application
		driver.get("http://www.google.com");
		//get the title of the application
		System.out.println(driver.getTitle());
		//get the URL of the application
		System.out.println(driver.getCurrentUrl());
		//close the browser
		driver.close();
	}

}

package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppLaunchedSuccessful {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://cmis4.anudip.org/");
		String expected_title="Login";
		String actual_title=driver.getTitle();
		if(actual_title.equals(expected_title))
			System.out.println("Application is launched successfully");
		else
			System.out.println("Application is not launched successfully");
	}

}

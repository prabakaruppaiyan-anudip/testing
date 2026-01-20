package handlingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathOptions {

	public static void main(String[] args) {
		//launching browser
		WebDriver driver=new ChromeDriver();
		//launching application
		driver.get("https://www.saucedemo.com/");
		//handle user name
		driver.findElement(By.xpath("//input[contains(@id,'user-name')]")).sendKeys("standard_user");
		//handle password
		driver.findElement(By.xpath("//input[starts-with(@id,'pass')]")).sendKeys("secret_sauce");
		//handle login button
		driver.findElement(By.xpath("//input[@name='login-button' and @type='submit']")).click();
	}
}

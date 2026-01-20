package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingID {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://learn.anudip.org/course");
		//identify or locate username using id locator
		WebElement un=driver.findElement(By.id("username"));
		//send test data to the user name field
		un.sendKeys("praba.karuppaiyan@anudip.org");
		//identify password using id and pass test data 
		driver.findElement(By.id("password")).sendKeys("pra123");
		//identify login button and perform click action
		driver.findElement(By.id("loginbtn")).click();
	}
}

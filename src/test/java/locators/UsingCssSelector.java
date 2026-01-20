package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCssSelector {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		WebElement fn=driver.findElement(By.cssSelector("#customer\\.firstName"));
		fn.sendKeys("Praba");
		driver.findElement(By.cssSelector(".input")).sendKeys("Karuppaiyan");
        
        
	}
}
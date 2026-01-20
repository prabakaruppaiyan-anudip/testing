package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIdLocator {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		//driver.findElement(By.id("APjFqb")).sendKeys("locators");
		WebElement search_box=driver.findElement(By.id("APjFqb"));
		search_box.sendKeys("locators");
		driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		//driver.close();
	}

}

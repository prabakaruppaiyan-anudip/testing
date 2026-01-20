package actionClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement search_box=driver.findElement(By.id("APjFqb"));
		Actions a=new Actions(driver);
		//search_box.sendKeys("selenium"+Keys.ENTER);
		//a.sendKeys(search_box,"selenium",Keys.ENTER).perform();
		search_box.sendKeys("selenium");
		Thread.sleep(2000);
		a.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		Thread.sleep(2000);
		a.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		Thread.sleep(2000);
		a.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
     
	}


}

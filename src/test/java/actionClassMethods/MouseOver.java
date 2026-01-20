package actionClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement drop_button=driver.findElement(By.xpath("//button[@class='dropbtn']"));
		WebElement menu_item=driver.findElement(By.xpath("//a[normalize-space()='Laptops']"));
		Actions a=new Actions(driver);
		/*
		 * a.moveToElement(drop_button); a.moveToElement(menu_item);
		 * a.build().perform();
		 */
		a.moveToElement(drop_button).moveToElement(menu_item).click().build().perform();
		//a.click();
	}


}

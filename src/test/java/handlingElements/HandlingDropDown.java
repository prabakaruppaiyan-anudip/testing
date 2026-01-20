package handlingElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {

	public static void main(String[] args) throws InterruptedException {
		//launch the chrome browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//launch the application
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"country\"]"));
		Select item=new Select(dropdown);
		//selectByIndex
		item.selectByIndex(3);
		Thread.sleep(2000);
		//select by visible text
		item.selectByVisibleText("United Kingdom");
		Thread.sleep(2000);
		//select by value
		item.selectByValue("japan");
		

	}

}

package actionClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement copy_text=driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));	
		Actions act=new Actions(driver);
		act.doubleClick(copy_text).perform();
		//*[@id="HTML10"]/div[1]/button

	}

}

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectDropDown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"colors\"]"));
		Select options=new Select(dropdown);
		options.selectByIndex(0);
		options.selectByVisibleText("Blue");
		List<WebElement> option_list=options.getOptions();
		for(WebElement we:option_list)
		{
			System.out.println(we.getText());
		}

	}

}

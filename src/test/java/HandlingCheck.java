import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheck {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> chk_boxes=driver.findElements(By.xpath("//*[@type='checkbox' and contains(@id,'day')]"));
		System.out.println(chk_boxes.size());
		for(WebElement we:chk_boxes)
		{
			if(!we.isSelected())
				we.click();
			System.out.println(we.getAttribute("id"));
		}
	}

}

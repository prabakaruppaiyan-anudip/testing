package handlingElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {

	public static void main(String[] args) {
		//launch the chrome browser
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				//launch the application
				driver.get("https://testautomationpractice.blogspot.com/");
				WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"colors\"]"));
				Select item=new Select(dropdown);
				item.selectByIndex(1);
				item.selectByVisibleText("Green");
				item.selectByValue("white");
				List<WebElement> it=item.getAllSelectedOptions();
				System.out.println(it.size());
				for(WebElement w:it)
				 System.out.println(w.getText());

	}

}

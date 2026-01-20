import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadio {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> options=driver.findElements(By.xpath("//*[@name='gender' and @type='radio']"));
        String gen;
		for(WebElement we:options) {
        	gen=we.getAttribute("id");
        	if(gen.equals("male"))
        		we.click();
        	System.out.println(we.getAttribute("id"));
		}
	}

}

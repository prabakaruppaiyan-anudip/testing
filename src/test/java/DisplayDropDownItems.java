
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DisplayDropDownItems {

	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement drop_down=driver.findElement(By.xpath("//*[@id=\"country\"]"));
        Select sel_item=new Select(drop_down);
        List<WebElement> options=sel_item.getOptions();
        System.out.println("Country drop down has "+options.size()+" items in the list");
        for(WebElement opt:options)
        	System.out.println(opt.getText());
	}

}


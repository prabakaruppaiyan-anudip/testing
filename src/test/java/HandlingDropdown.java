import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
        WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"country\"]"));
        Select options=new Select(dropdown);
        //options.selectByIndex(2);
        //options.deselectAll();
        //options.selectByVisibleText("Canada");
        options.selectByValue("canada");

	}

}

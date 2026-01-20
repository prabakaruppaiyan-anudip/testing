
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-input\"]")).sendKeys("Software Testing");
		driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-form\"]/div/span[2]/span[2]/input")).click();
		List<WebElement> links=driver.findElements(By.xpath("//*[@id=\"wikipedia-search-result-link\"]/a"));
		for(WebElement l:links)
			l.click();
		//close the currently active browser window
		//driver.close();
		//close all windows
		//driver.quit();
		//display id of the parent window
		//System.out.println(driver.getWindowHandle());
		Set<String> window_ids=driver.getWindowHandles();
		//System.out.println(window_ids);
		List<String> win_ids=new ArrayList<String>(window_ids);
		for(String id:win_ids)
		{
			//System.out.println(id);
			driver.switchTo().window(id);
			System.out.println("Title is "+driver.getTitle());
			//driver.close();
		}
	}
}

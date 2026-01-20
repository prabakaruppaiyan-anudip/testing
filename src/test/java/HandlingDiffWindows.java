
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDiffWindows {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		System.out.println("Browser Opened");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Windows.html");
		System.out.println("Application Opened");
		//Handling New Window
		driver.findElement(By.linkText("Open New Seperate Windows")).click();
		driver.findElement(By.xpath("//*[@id=\"Seperate\"]/button")).click();
		//capture all windows id
		Set<String> window_ids=driver.getWindowHandles(); 
		//convert set into list
		List<String> win_ids=new ArrayList<String>(window_ids); 
		for(String wid:win_ids) {
		 driver.switchTo().window(wid); 
		 String current_title=driver.getTitle();
		 System.out.println("Title of the window "+current_title);
		 if(current_title.equalsIgnoreCase("selenium"))
			  driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/a/span")).
			  click();
		
		}
		
	}
}

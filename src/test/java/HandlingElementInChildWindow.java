
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingElementInChildWindow {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
		//get the id of the parent id
		String parent_id=driver.getWindowHandle();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		//handling element in the child window
		 driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		Set<String> window_ids=driver.getWindowHandles(); 
		 List<String> win_ids=new ArrayList<String>(window_ids); 
	   for(String wid:win_ids) {
		  driver.switchTo().window(wid); String current_title=driver.getTitle();
		  System.out.println("Title of the window "+current_title);
		  if(current_title.equalsIgnoreCase("selenium"))
		   driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/a/span")). click();
		  }
		 driver.switchTo().window(parent_id);
		 System.out.println(driver.getTitle());
		}
}


package handlingElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckbox {

	public static void main(String[] args) {
		//launch the chrome browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//launch the application
		driver.get("https://testautomationpractice.blogspot.com/");
		//select particular element
		//driver.findElement(By.id("wednesday")).click();
		List<WebElement> chk_boxes=driver.findElements(By.xpath("//*[@type='checkbox']"));
		System.out.println(chk_boxes.size());
		List<WebElement> days=driver.findElements(By.xpath("//*[@type='checkbox' and contains(@id, 'day')]"));
		System.out.println(days.size());
		/*
		 * for(WebElement c:days) { if(!c.isSelected()) c.click();
		 * System.out.println(c.getAttribute("id")); }
		 */
		/*
		 * for(WebElement c:days) { String day=c.getAttribute("id");
		 * if(day.equals("friday")) c.click(); System.out.println(c.getAttribute("id"));
		 * }
		 */
		/*
		 * for(int i=0; i<2; i++) { days.get(i).click();
		 * 
		 * }
		 */
		int size=days.size();
		for(int i=size-2; i<size; i++)
		{
			days.get(i).click();
		
		}
	}
	

}

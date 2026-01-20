package handlingElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadioButton {

	public static void main(String[] args) {
		//launch the chrome browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//launch the application
		driver.get("https://testautomationpractice.blogspot.com/");
		//select female radio button id='female'
		//driver.findElement(By.id("female")).click();
		List<WebElement> options=driver.findElements(By.xpath("//*[@type='radio']"));
		System.out.println(options.size());
		String gen="female";
		for(WebElement g:options)
		{			
			if(g.getAttribute("id").equals(gen))
				g.click();
		}   
		
		
		
	}

}

package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingTag {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		//Get all input elements 
		List<WebElement> inputs=driver.findElements(By.tagName("input"));
		//Display number of input elements
		System.out.println(inputs.size());
		//Get all input elements 
		List<WebElement> links=driver.findElements(By.tagName("a"));
		//Display number of input elements
		System.out.println(links.size());
		

	}

}

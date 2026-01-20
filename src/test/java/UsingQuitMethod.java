


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingQuitMethod {

	public static void main(String[] args) throws InterruptedException {
		//Launching Browser
		WebDriver driver=new ChromeDriver();
		//Maximize the browser window
		driver.manage().window().maximize();
		//Open the application
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//identify the wikipedia search box and send text into it
		driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-input\"]")).sendKeys("Software Testing");
		//identify the search button and perform click action
		driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-form\"]/div/span[2]/span[2]/input")).click();
		//identify all the result links
		List<WebElement> links=driver.findElements(By.xpath("//*[@id=\"wikipedia-search-result-link\"]/a"));
		//open all the links
		for(WebElement l:links)
			l.click();
		//To close currently active browser window
		//It will close testautomationpractice web page
		//driver.close();
		//To close all windows at once
		driver.quit();
	}
}


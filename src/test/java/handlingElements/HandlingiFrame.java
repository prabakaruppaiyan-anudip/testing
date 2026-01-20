package handlingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingiFrame {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Single Iframe ")).click();
       // driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[1]/a")).click();
        //WebElement iframe=driver.findElement(By.xpath("/html/body/section/div/div"));
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Hi, Goood morning");
       	}

}

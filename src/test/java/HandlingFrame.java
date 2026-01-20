import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingFrame {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[1]/a")).click();
		//WebElement singleFrame=driver.findElement(By.xpath("/html/body/section/div/div"))
		driver.switchTo().frame(0);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div/div/div/input"))).sendKeys("Praba");
		//driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Praba");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
		//WebElement outer_frame=driver.findElement(By.xpath("/html/body/section/div"))
		WebElement frame1=driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[2]/div[2]/iframe"));		
		driver.switchTo().frame(frame1);
		WebElement frame2=driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Hi all, Good morning");
	}
 }

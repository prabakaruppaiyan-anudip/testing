package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		String expected_title="Automation Exercise";
		if(expected_title.equalsIgnoreCase(driver.getTitle()))
			System.out.println("Application launched successfully");
		else
			System.out.println("Application is not launched successfully");
		driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
	    //System.out.println(driver.getPageSource());
		if(driver.getPageSource().contains("New User Signup!"))
			System.out.println("New User Signup! is verified");
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Praba");
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("k.praba@yahoo.com");
	    driver.findElement(By.xpath("//button[normalize-space()='Signup']")).click();
	    if(driver.getPageSource().contains("Enter Account Information"))
	    	System.out.println("Enter Account Information is visible");
	
	}
	

}

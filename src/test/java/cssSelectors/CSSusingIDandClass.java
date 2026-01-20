package cssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSusingIDandClass {

	public static void main(String[] args) {
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector(".input[id=customer\\.firstName]")).sendKeys("Praba");
		driver.findElement(By.cssSelector("#customer\\.lastName")).sendKeys("Karuppaiyan");
		driver.findElement(By.cssSelector("[name=customer\\.address\\.street")).sendKeys("Kaggadasapura");
		driver.findElement(By.xpath("//*[@id=\"customer.address.city\"]")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//*[@id=\"customer.address.state\"]")).sendKeys("Karnataka");
		driver.findElement(By.cssSelector("#customer\\.address\\.zipCode")).sendKeys("560092");
		driver.findElement(By.xpath("//*[@id=\"customer.phoneNumber\"]")).sendKeys("9876576431");
	    driver.findElement(By.xpath("//*[@id=\"customer.ssn\"]")).sendKeys("123456");
	    driver.findElement(By.xpath("//*[@id=\"customer.username\"]")).sendKeys("kpraba");
	    driver.findElement(By.xpath("//*[@id=\"customer.password\"]")).sendKeys("kpraba123");
	    driver.findElement(By.xpath("//*[@id=\"repeatedPassword\"]")).sendKeys("kpraba123");
	    driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
	    String confirm_msg="Your account was created successfully. You are now logged in.";
	    if(driver.getPageSource().contains(confirm_msg))
	    	System.out.println("Registration successfull");
	
	}

}

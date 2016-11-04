package Divrt.Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home
{
	public static WebElement Emailaddress1(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='me']"));
		
	}
	public static WebElement Password(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='pwd']"));
		
	}
	public static WebElement Submit(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='btn-login']"));
		
	}
	
}

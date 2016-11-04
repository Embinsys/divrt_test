package Divrt.Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class creatAccount
{
	public static WebElement CreatAccount1(WebDriver driver)
	{
		return driver.findElement(By.xpath(".//*[@id='login-form']/div[7]/p/a"));
	}
	public static WebElement Phone(WebDriver driver)
	{
		return driver.findElement(By.xpath(".//*[@id='register-form']/div[2]/input"));
	}
	public static WebElement Email(WebDriver driver)
	{
		return driver.findElement(By.xpath(".//*[@id='register-form']/div[3]/input"));
		
	}
	public static WebElement Password(WebDriver driver)
	{
		return driver.findElement(By.xpath(".//*[@id='pwp1']"));
		
	}
	public static WebElement Retypepassword(WebDriver driver)
	{
		return driver.findElement(By.xpath(".//*[@id='cpassword']"));
		
	}
	public static WebElement Submit(WebDriver driver)
	{
		return driver.findElement(By.xpath(".//*[@id='btn-submit']"));
		
	}
	public static WebElement Login(WebDriver driver)
	{
		return driver.findElement(By.xpath(".//*[@id='register-form']/div[8]/p/a"));
		
	}	
	
}

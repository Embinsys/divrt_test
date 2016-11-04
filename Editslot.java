package Divrt.Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Editslot
{
	public static WebElement Myzone(WebDriver driver)
	{
		return driver.findElement(By.xpath(".//*[@id='sidebar-menu']/div/ul/li[2]/a"));
	}
	public static WebElement Getslotdetails(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='datatable']/tbody/tr/td[7]/button"));
	}
	
	
}

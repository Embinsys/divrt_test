package Divrt.Dashboard;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Divrtapk {
	
	  static AndroidDriver driver;
	
	@Test
	public static void launch() throws MalformedURLException, InterruptedException 
	{
		 
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("deviceName","ZX1D64Q4RF");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability(CapabilityType.VERSION, "6.0");
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
        capabilities.setCapability("appPackage", "prod.divrt.co");
        capabilities.setCapability("appActivity", "com.divrt.sign_login_splsh.SplashScreenActivity");
               
		driver =  new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		Thread.sleep(1000);
		
		/*driver.findElement(By.name("DONE")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("prod.divrt.co:id/menu_button")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("prod.divrt.co:id/user_mail")).click();
		Thread.sleep(2000);
		driver.navigate().back();
	    driver.findElement(By.id("prod.divrt.co:id/new_register")).click();
	    WebElement email = driver.findElement(By.id("prod.divrt.co:id/etEmail"));
	    email.clear();
	    email.sendKeys("shyamsundar.1811@gmail.com");
	    Thread.sleep(1000);
	    WebElement phonenumber  = driver.findElement(By.id("prod.divrt.co:id/etMobileNUmber"));
	    phonenumber.clear();
	    phonenumber.sendKeys("8978756754");
	    Thread.sleep(1000);
	    WebElement password = driver.findElement(By.id("prod.divrt.co:id/password"));
	    password.clear();
	    password.sendKeys("aditya");
	    Thread.sleep(1000);
	    driver.navigate().back();
	    Thread.sleep(1000);
	    WebElement confirmpass = driver.findElement(By.id("prod.divrt.co:id/etCOnfPass"));
	    confirmpass.clear();
	    confirmpass.sendKeys("aditya");
	    Thread.sleep(1000);
	    driver.navigate().back();
	    driver.findElement(By.id("prod.divrt.co:id/next_button")).click();
	    Thread.sleep(20000);
	    driver.findElement(By.id("prod.divrt.co:id/submit_button")).click();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    Thread.sleep(2000);
	    driver.findElement(By.id("prod.divrt.co:id/fab")).click();
	    Thread.sleep(2000);*/
	   driver.findElement(By.id("prod.divrt.co:id/image_search")).click();
		
		
	
		/*Thread.sleep(1000);
		
		 driver.navigate().back();*/
	
	}
	/*@Test
	public void done() throws InterruptedException 
	{
	
		
		WebElement Gps = driver.findElement(By.name("Yes"));
		if(Gps.isDisplayed()) 
		{
			Gps.click();
		}
		else
		{
			return;
			
		}
		
	
	
    driver.findElement(By.id("prod.divrt.co:id/search_bar")).sendKeys("HSR Layout");
    
    driver.findElement(By.id("prod.divrt.co:id/seekBar")).click();
    WebElement seekbar = driver.findElement(By.id("prod.divrt.co:id/seekBar"));
	Actions sb = new Actions(driver);
	sb.dragAndDropBy(seekbar, 20, 0).build().perform();
	Thread.sleep(1000);
	WebElement seekbar1 = driver.findElement(By.xpath("//*[@id='slider-range']/span[2]"));
	Actions sb1 = new Actions(driver);
	sb1.dragAndDropBy(seekbar1, 90, 0).build().perform();
	Thread.sleep(1000);
    driver.findElement(By.id("prod.divrt.co:id/seekBar2")).click();
    driver.findElement(By.id("//android.view.View[@index='23']")).click();
    driver.findElement(By.id("prod.divrt.co:id/search_bar")).click();
    driver.findElement(By.xpath("//android.view.View[@content-desc='7.1.']")).click();
	
    //driver.findElement(By.xpath("//android.widget.RelativeLayout[@index='3']")).click();

    driver.findElement(By.id("prod.divrt.co:id/menu_button")).click();
    driver.findElement(By.id("prod.divrt.co:id/user_mail")).click();
    driver.navigate().back();
    driver.findElement(By.id("prod.divrt.co:id/new_register")).click();
    WebElement email = driver.findElement(By.id("prod.divrt.co:id/etEmail"));
    email.clear();
    email.sendKeys("mpaditya12@gmail.com");
    Thread.sleep(1000);
    WebElement phonenumber  = driver.findElement(By.id("prod.divrt.co:id/etMobileNUmber"));
    phonenumber.clear();
    phonenumber.sendKeys("9030007974");
    Thread.sleep(1000);
    WebElement password = driver.findElement(By.id("prod.divrt.co:id/password"));
    password.clear();
    password.sendKeys("aditya");
    Thread.sleep(1000);
    driver.navigate().back();
    Thread.sleep(1000);
    WebElement confirmpass = driver.findElement(By.id("prod.divrt.co:id/etCOnfPass"));
    confirmpass.clear();
    confirmpass.sendKeys("aditya");
    Thread.sleep(1000);
    driver.navigate().back();
    Thread.sleep(1000);
    driver.findElement(By.id("prod.divrt.co:id/next_button")).click();
    Thread.sleep(20000);
    driver.findElement(By.id("prod.divrt.co:id/submit_button")).click();
    driver.findElement(By.id("prod.divrt.co:id/etEmail")).click();
    driver.findElement(By.id("prod.divrt.co:id/etEmail")).click();
    driver.findElement(By.id("prod.divrt.co:id/etEmail")).click();
 
        
	 }*/
}

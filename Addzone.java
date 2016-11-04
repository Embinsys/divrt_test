package Divrt.Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Addzone 
{
	//MyZone
	public static WebElement Myzone(WebDriver driver)
	{
		return driver.findElement(By.xpath(".//*[@id='sidebar-menu']/div/ul/li[2]/a"));
	}
	//Add Zone
	public static WebElement Addzone1(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/div[3]/div/div[3]/div[1]/div/div/div[2]/div[1]/div[3]/a"));
	}
	public static WebElement zoneid(WebDriver driver)
	{
		return driver.findElement(By.id("user_provider_name"));
	}
	//Address
	public static WebElement Address(WebDriver driver)
	{
		return driver.findElement(By.id("address2"));
	}
	//geo frequency
	public static WebElement GeoRadius(WebDriver driver)
	{
		return driver.findElement(By.id("geofencing"));
	}
	//Currency
	public static Select Currency(WebDriver driver)
	{
		return  new Select(driver.findElement(By.id("currency_type")));
	}
	//4 Wheeler capicity
	public static WebElement fourwheelercapicity(WebDriver driver)
	{
		return driver.findElement(By.id("max4"));
	}
	//4Wheeler price
	public static WebElement fourwheelerprice(WebDriver driver)
	{
		return driver.findElement(By.id("4wheelerprice"));
	}
	public static WebElement Twowheelercapacity(WebDriver driver)
	{
		return driver.findElement(By.id("max2"));
	}
	public static WebElement Twowheelerprice(WebDriver driver)
	{
		return driver.findElement(By.id("price2"));
	}
	public static WebElement Minimumduration(WebDriver driver)
	{
		return driver.findElement(By.name("minduration"));
	}
	public static WebElement Minimumdurationprice(WebDriver driver)
	{
		return driver.findElement(By.name("mindurationprice"));
	}
	public static WebElement priceperhour(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='pphr']"));
	}
	//sunday
	public static WebElement sunday(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='register-newzone-form']/div[14]/div/div/div[1]/div/label/div/ins"));
	}
	//monday
	public static WebElement Monday(WebDriver driver)
	{
		return driver.findElement((By.xpath("//*[@id='register-newzone-form']/div[14]/div/div/div[2]/div/label/div/ins")));
	}
	//tuesday
	public static WebElement Tuesday(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='register-newzone-form']/div[14]/div/div/div[3]/div/label/div/ins"));
	}
	//wednesday
	public static WebElement wednesday(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='register-newzone-form']/div[14]/div/div/div[4]/div/label/div/ins"));
	}
	//Thursday
	public static WebElement Thursday(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='register-newzone-form']/div[14]/div/div/div[5]/div/label/div/ins"));
	}
	//Friday
	public static WebElement Friday(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='register-newzone-form']/div[14]/div/div/div[6]/div/label/div/ins"));
	}
	//Saturday
	public static WebElement Saturday(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='register-newzone-form']/div[14]/div/div/div[7]/div/label/div/ins"));
	}
	//Range Slider
	public static WebElement Rangeslider1 (WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='slider-range']/span[1]"));
	}
	//Range Slider
	public static WebElement Rangeslider2 (WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='slider-range']/span[2]"));
	}
	//Facilities available
	public static WebElement carwash(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='register-newzone-form']/div[16]/div/div[1]/label/div/ins"));
	}
	//vallet parking
	public static WebElement valletparking(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='register-newzone-form']/div[16]/div/div[2]/label/div/ins"));
	}
	//airport services
	public static WebElement Airportservice(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='register-newzone-form']/div[16]/div/div[3]/label/div/ins"));
	}
	//Evcharging
	public static WebElement Evcharging(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='register-newzone-form']/div[16]/div/div[4]/label/div/ins"));
	}
	//noof levels
	public static WebElement Enternumberoflevels(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='nooflevels']"));
	}
	//clickon go
	public static WebElement Gobutton(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='nooflevel']"));
	}
	//level1
	public static WebElement Levelname1(WebDriver driver)
	{
		return driver.findElement(By.id("levelname0"));
	}
	public static WebElement Totalspot1(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='levelrange0']"));
	}
	public static WebElement Sensor1(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='levelsensor0']"));
	}
	//level2
	public static WebElement Levelname2(WebDriver driver)
	{
		return driver.findElement(By.id("levelname1"));
	}
	public static WebElement Totalspot2(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='levelrange1']"));
	}
	public static WebElement Sensor2(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='levelsensor1']"));
	}
	//level3
	public static WebElement Levelname3(WebDriver driver)
	{
		return driver.findElement(By.id("levelname2"));
	}
	public static WebElement Totalspot3(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='levelrange2']"));
	}
	public static WebElement Sensor3(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='levelsensor2']"));
	}
	//level4
	public static WebElement Levelname4(WebDriver driver)
	{
		return driver.findElement(By.id("levelname3"));
	}
	public static WebElement Totalspot4(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='levelrange3']"));
	}
	public static WebElement Sensor4(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='levelsensor3']"));
	}
	//level5
	public static WebElement Levelname5(WebDriver driver)
	{
		return driver.findElement(By.id("levelname4"));
	}
	public static WebElement Totalspot5(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='levelrange4']"));
	}
	public static WebElement Sensor5(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='levelsensor4']"));
	}
	
	//Level6
	public static WebElement Levelname6(WebDriver driver)
	{
		return driver.findElement(By.id("levelname5"));
	}
	public static WebElement Totalspot6(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='levelrange5']"));
	}
	public static WebElement Sensor6(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='levelsensor5']"));
	}
	//Level7
	public static WebElement Levelname7(WebDriver driver)
	{
		return driver.findElement(By.id("levelname6"));
	}
	public static WebElement Totalspot7(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='levelrange6']"));
	}
	public static WebElement Sensor7(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='levelsensor6']"));
	}
	//Level8
	public static WebElement Levelname8(WebDriver driver)
	{
		return driver.findElement(By.id("levelname7"));
	}
	public static WebElement Totalspot8(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='levelrange7']"));
	}
	public static WebElement Sensor8(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='levelsensor7']"));
	}
	//Level9
	public static WebElement Levelname9(WebDriver driver)
	{
		return driver.findElement(By.id("levelname8"));
	}
	public static WebElement Totalspot9(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='levelrange8']"));
	}
	public static WebElement Sensor9(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='levelsensor8']"));
	}
	//Level10
	public static WebElement Levelname10(WebDriver driver)
	{
		return driver.findElement(By.id("levelname9"));
	}
	public static WebElement Totalspot10(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='levelrange9']"));
	}
	public static WebElement Sensor10(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='levelsensor9']"));
	}
	public static WebElement Addbutton(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='levelsubmit']/div[2]/button"));
	}
	
	//Terms and Conditions
	public static WebElement TermsAndConditions(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='message']"));
	}
	//Phonenumber
	
	public static WebElement Phonenumber(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='middle-name']"));
	}
	//NumberUsageType
	public static Select NumberUsageType(WebDriver driver)
	{
		return  new Select(driver.findElement(By.id("use_type")));
	}
	//Email
	public static WebElement EmailAddress(WebDriver driver)
	{
		return driver.findElement(By.name("me"));
	}
	//EmailUsageType
	public static Select EmailUsageType(WebDriver driver)
	{
		return  new Select(driver.findElement(By.id("email_use_type")));
	}
	//Address1
	public static WebElement Address1(WebDriver driver)
	{
		return driver.findElement(By.id("user_address1"));
	}
	//Address2
	public static WebElement Address2(WebDriver driver)
	{
		return driver.findElement(By.id("user_address2"));
	}
	//country
	public static WebElement Country(WebDriver driver)
	{
		return driver.findElement(By.id("user_country"));
	}
	
	//State
	public static WebElement State(WebDriver driver)
	{
		return driver.findElement(By.id("user_state"));
	}
	//city
	public static WebElement City(WebDriver driver)
	{
		return driver.findElement(By.id("user_city"));
	}
	//Zipcode
	public static WebElement ZipCode(WebDriver driver)
	{
		return driver.findElement(By.id("user_zipcode"));
	}
	//i accert
	public static WebElement iaccept(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='termsclass']/div/ins"));
	}
	
	//Submit Button
	public static WebElement SubmitButton(WebDriver driver)
	{
		return driver.findElement(By.id("btn-submit"));
	}
	//Cancle Button
		public static WebElement CancleButton(WebDriver driver)
		{
			return driver.findElement(By.xpath("//*[@id='register-newzone-form']/div[36]/div/a"));
		}
		
	
	


}




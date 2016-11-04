package Divrt.Dashboard;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Repository
{
	public WebDriver driver;
	
	public void LaunchApp1()
	{
		/*System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver=new ChromeDriver();*/
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.divrt.co");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public void Creatacc(String PhoneNo,String Email1,String Password,String RePassword) throws Exception
	{
		creatAccount.CreatAccount1(driver).click();
		Thread.sleep(3000);
		creatAccount.Phone(driver).clear();
		creatAccount.Phone(driver).sendKeys(PhoneNo);
		Thread.sleep(3000);
		creatAccount.Email(driver).clear();
		creatAccount.Email(driver).sendKeys(Email1);
		Thread.sleep(3000);
		creatAccount.Password(driver).clear();
		creatAccount.Password(driver).sendKeys(Password);
		Thread.sleep(3000);
		creatAccount.Retypepassword(driver).clear();
		creatAccount.Retypepassword(driver).sendKeys(RePassword);
		Thread.sleep(3000);
		creatAccount.Submit(driver).click();
		
		creatAccount.Login(driver).click();
		Thread.sleep(3000);
	}
	public void Login() throws Exception
	{
		creatAccount.Login(driver).click();
		Thread.sleep(3000);
	}
	public void Homepage(String Email,String Password) throws Exception
	{
		Home.Emailaddress1(driver).clear();
		Home.Emailaddress1(driver).sendKeys(Email);
		Thread.sleep(3000);
		Home.Password(driver).clear();
		Home.Password(driver).sendKeys(Password);
		Thread.sleep(3000);
		Home.Submit(driver).click();
		
		
	}
	public void MyZone() throws InterruptedException
	{
	
        //click Addnewzone
		
		WebElement Myzone = driver.findElement(By.xpath(".//*[@id='sidebar-menu']/div/ul/li[2]/a"));
		Myzone.click();
		//Thread.sleep(2000);
		//WebDriverWait wait = new WebDriverWait(driver, 60);// 1 minute 
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//A[@href='https://dev-dash.divrt.co/addzone.php']")));
		WebElement addzone = driver.findElement(By.xpath("html/body/div[3]/div/div[3]/div[1]/div/div/div[2]/div[1]/div[3]/a"));
		if(addzone.isDisplayed())
		{
			System.out.println("Avaliable");
		}
		else
		{
			System.out.println("Not available");
		}
		addzone.click();
		Thread.sleep(1000);
		WebElement zoneid = driver.findElement(By.id("user_provider_name"));
		zoneid.clear();
		zoneid.sendKeys("Ramnagar");
		Thread.sleep(1000);
		WebElement address = driver.findElement(By.id("address2"));
		address.clear();
		address.sendKeys("B-17/F-1 TRT quarters, Ramnagar, Hyderabad-20");
		Thread.sleep(1000);
		WebElement fourwheelerprice = driver.findElement(By.id("4wheelerprice"));
		fourwheelerprice.clear();
		fourwheelerprice.sendKeys("50");
		Thread.sleep(1000);
		WebElement twowheelercapacity = driver.findElement(By.id("max2"));
		twowheelercapacity.clear();
		twowheelercapacity.sendKeys("20");
		Thread.sleep(1000);
		WebElement twowheelerprice = driver.findElement(By.id("price2"));
		twowheelerprice.clear();
		twowheelerprice.sendKeys("20");
		Thread.sleep(1000);
		WebElement minimumduration = driver.findElement(By.name("minduration"));
		minimumduration.clear();
		minimumduration.sendKeys("1");
		Thread.sleep(1000);
		//click on Daysopen
		WebElement sunday = driver.findElement(By.xpath("//*[@id='register-newzone-form']/div[14]/div/div/div[1]/div/label/div/ins"));
		sunday.click();
		Thread.sleep(2000);
		//click on sunday
		WebElement monday = driver.findElement(By.xpath("//*[@id='register-newzone-form']/div[14]/div/div/div[2]/div/label/div/ins"));
		monday.click();
		Thread.sleep(1000);
		//tuesday
		WebElement Tuesday = driver.findElement(By.xpath("//*[@id='register-newzone-form']/div[14]/div/div/div[3]/div/label/div/ins"));
		Tuesday.click();
		Thread.sleep(1000);
		//Wednesday
		WebElement wednesday = driver.findElement(By.xpath("//*[@id='register-newzone-form']/div[14]/div/div/div[4]/div/label/div/ins"));
		wednesday.click();
		Thread.sleep(1000);
		 //thursday
		WebElement Thursday = driver.findElement(By.xpath("//*[@id='register-newzone-form']/div[14]/div/div/div[5]/div/label/div/ins"));
		Thursday.click();
		Thread.sleep(1000);
		//friday
		WebElement Friday = driver.findElement(By.xpath("//*[@id='register-newzone-form']/div[14]/div/div/div[6]/div/label/div/ins"));
		Friday.click();
		Thread.sleep(1000);
		//saturday
		WebElement Saturday = driver.findElement(By.xpath("//*[@id='register-newzone-form']/div[14]/div/div/div[7]/div/label/div/ins"));
		Saturday .click();
		Thread.sleep(1000);
		WebElement Rangeslider1 = driver.findElement(By.xpath("//*[@id='slider-range']/span[1]"));
		Actions rs1 = new Actions(driver);
		rs1.dragAndDropBy(Rangeslider1, 30, 0).build();
		Thread.sleep(1000);
		WebElement Rangeslider2 = driver.findElement(By.xpath("//*[@id='slider-range']/span[2]"));
		Actions rs2 = new Actions(driver);
		rs2.dragAndDropBy(Rangeslider2, 60, 0).build();
		Thread.sleep(1000);
		
		
		//Facilities available
		WebElement carwash= driver.findElement(By.xpath("//*[@id='register-newzone-form']/div[16]/div/div[1]/label/div/ins"));
		carwash.click();
		Thread.sleep(1000);
		//valet parking
		WebElement valletparking= driver.findElement(By.xpath("//*[@id='register-newzone-form']/div[16]/div/div[2]/label/div/ins"));
		valletparking.click();
		Thread.sleep(1000);
		
		//Airport services
		WebElement Airportservice= driver.findElement(By.xpath("//*[@id='register-newzone-form']/div[16]/div/div[3]/label/div/ins"));
		Airportservice.click();
		//EV charging
		WebElement Evcharging= driver.findElement(By.xpath("//*[@id='register-newzone-form']/div[16]/div/div[4]/label/div/ins"));
		Evcharging.click();
		Thread.sleep(1000);
		
		WebElement Enternooflevels = driver.findElement(By.xpath("//*[@id='nooflevels']"));
		Enternooflevels.clear();
		Enternooflevels.sendKeys("1");
		Thread.sleep(1000);
		WebElement Go = driver.findElement(By.xpath("//*[@id='nooflevel']"));
		Go.click();
		WebElement levelname = driver.findElement(By.id("levelname0"));
		levelname.sendKeys("firstfloor");
		Thread.sleep(1000);
		driver.findElement(By.id("levelrange0")).sendKeys("20");
		Thread.sleep(1000);
		driver.findElement(By.id("levelsensor0")).sendKeys("10");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//DIV[@id='levelsubmit']")).click();
		WebElement Termsandconditions = driver.findElement(By.id("message"));
		Termsandconditions.clear();
		Termsandconditions.sendKeys("some text");
		Thread.sleep(1000);
		WebElement phonenumber = driver.findElement(By.name("tn"));
		phonenumber.clear();
		phonenumber.sendKeys("9030007974");
		Thread.sleep(1000);
		//drop down by select class
		WebElement numberusagetype=driver.findElement(By.name("ts"));
		Select s=new Select(numberusagetype);
		s.selectByValue("2");
		Thread.sleep(1000);
		WebElement email = driver.findElement(By.name("me"));
		email.clear();
		email.sendKeys("mpaditya93@gmail.com");
		Thread.sleep(1000);
		WebElement Emailusagetype=driver.findElement(By.name("ms"));
		Select se=new Select(Emailusagetype);
		se.selectByValue("4");
		Thread.sleep(1000);
		WebElement address1 = driver.findElement(By.id("user_address1"));
		address1.clear();
		address1.sendKeys("Ramnagar");
		Thread.sleep(1000);
		WebElement address2 = driver.findElement(By.id("user_address2"));
		address2.clear();
		address2.sendKeys("lingampally");
		Thread.sleep(1000);
		WebElement country = driver.findElement(By.id("user_country"));
		country.clear();
		country.sendKeys("india");
		Thread.sleep(1000);
		WebElement state = driver.findElement(By.id("user_state"));
		state.clear();
		state.sendKeys("Telangana");
		Thread.sleep(1000);
		WebElement city = driver.findElement(By.id("user_city"));
		city.clear();
		city.sendKeys("Ramnagar");
		Thread.sleep(1000);
		WebElement zipcode = driver.findElement(By.id("user_zipcode"));
		zipcode.clear();
		zipcode.sendKeys("500020");
		Thread.sleep(1000);
		// clickTerms and conditions
		WebElement Terms= driver.findElement(By.xpath("//*[@id='termsclass']/div/ins"));
		Terms.click();
		Thread.sleep(1000);
		WebElement submit = driver.findElement(By.id("btn-submit"));
		submit.click();
		/*Thread.sleep(15000);
		WebElement logout = driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[6]"));
		logout.click();*/
		
		 
		
	}
	
	
	
	public void Myzone(String Name,String Address,String georadius,String Currency,
			String NoLevels,String LName,String Spots,String Sensor,String Lname1,String Spots1,String Sensor1,
			String Lname2,String Spots2,String Sensor2,String MinDuration,String MinDurationprice,String PPHour,String conditions,String Phonenum,String NumUSGType,
			String Email,String EmailUSGType,String Address1,String Address2,String Country,String State,String City,String Zipcode) throws Exception
	{
		Addzone.Myzone(driver).click();
		Addzone.Addzone1(driver).click();
		Thread.sleep(2000);
		Addzone.zoneid(driver).clear();
		Addzone.zoneid(driver).sendKeys(Name);
		Thread.sleep(2000);
		Addzone.Address(driver).clear();
		Addzone.Address(driver).sendKeys(Address);
		Thread.sleep(2000);
		Addzone.GeoRadius(driver).sendKeys(georadius);
		Thread.sleep(2000);
		Addzone.Currency(driver).selectByVisibleText(Currency);
		Thread.sleep(2000);
		Thread.sleep(2000);
		Addzone.Enternumberoflevels(driver).clear();
		Addzone.Enternumberoflevels(driver).sendKeys(NoLevels);
		Addzone.Gobutton(driver).click();
		Thread.sleep(2000);
		Addzone.Levelname1(driver).clear();
		Addzone.Levelname1(driver).sendKeys(LName);
		Thread.sleep(1000);
		Addzone.Totalspot1(driver).clear();
		Addzone.Totalspot1(driver).sendKeys(Spots);
		Thread.sleep(1000);
		Addzone.Sensor1(driver).clear();
		Addzone.Sensor1(driver).sendKeys(Sensor);
		Thread.sleep(2000);
		
		Addzone.Levelname2(driver).clear();
		Addzone.Levelname2(driver).sendKeys(Lname1);
		Thread.sleep(1000);
		Addzone.Totalspot2(driver).clear();
		Addzone.Totalspot2(driver).sendKeys(Spots1);
		Thread.sleep(1000);
		Addzone.Sensor2(driver).clear();
		Addzone.Sensor2(driver).sendKeys(Sensor1);
		Thread.sleep(2000);
		Addzone.Levelname3(driver).clear();
		Addzone.Levelname3(driver).sendKeys(Lname2);
		Thread.sleep(1000);
		Addzone.Totalspot3(driver).clear();
		Addzone.Totalspot3(driver).sendKeys(Spots2);
		Thread.sleep(1000);
		Addzone.Sensor3(driver).clear();
		Addzone.Sensor3(driver).sendKeys(Sensor2);
		Thread.sleep(2000);
		Addzone.Addbutton(driver).click();
		/*Addzone.fourwheelercapicity(driver).clear();
		Addzone.fourwheelercapicity(driver).sendKeys(FourCapicity);*/
		Thread.sleep(2000);
		/*Addzone.fourwheelerprice(driver).clear();
		Addzone.fourwheelerprice(driver).sendKeys(FourPrice);
		Thread.sleep(2000);
		Addzone.Twowheelercapacity(driver).clear();
		Addzone.Twowheelercapacity(driver).sendKeys(Twowheelercap);
		Thread.sleep(2000);
		Addzone.Twowheelerprice(driver).clear();
		Addzone.Twowheelerprice(driver).sendKeys(TwoPrice);
		Thread.sleep(2000);*/
		Addzone.Minimumduration(driver).clear();
		Addzone.Minimumduration(driver).sendKeys(MinDuration);
		Thread.sleep(2000);
		Addzone.Minimumdurationprice(driver).clear();
		Addzone.Minimumdurationprice(driver).sendKeys(MinDurationprice);
		Thread.sleep(2000);
		Addzone.priceperhour(driver).clear();
		Addzone.priceperhour(driver).sendKeys(PPHour);
		
		//Daysopen
		Addzone.sunday(driver).click();
		Addzone.Monday(driver).click();
		Addzone.Tuesday(driver).click();
		Addzone.wednesday(driver).click();
		Addzone.Thursday(driver).click();
		Addzone.Friday(driver).click();
		Addzone.Saturday(driver).click();
		Thread.sleep(2000);
		WebElement Rangeslider1 = driver.findElement(By.xpath("//*[@id='slider-range']/span[1]"));
		Actions rs1 = new Actions(driver);
		rs1.dragAndDropBy(Rangeslider1, 30, 0).build();
		Thread.sleep(1000);
		WebElement Rangeslider2 = driver.findElement(By.xpath("//*[@id='slider-range']/span[2]"));
		Actions rs2 = new Actions(driver);
		rs2.dragAndDropBy(Rangeslider2, 60, 0).build();
		Thread.sleep(1000);
		Addzone.carwash(driver).click();
		Thread.sleep(1000);
		Addzone.valletparking(driver).click();
		Thread.sleep(1000);
		Addzone.Airportservice(driver).click();
		Thread.sleep(1000);
		Addzone.Evcharging(driver).click();
		
		
		//Terms&conditions
		Addzone.TermsAndConditions(driver).clear();
		Addzone.TermsAndConditions(driver).sendKeys(conditions);
		Thread.sleep(2000);
		//PhoneNumber
		Addzone.Phonenumber(driver).clear();
		Addzone.Phonenumber(driver).sendKeys(Phonenum);
		Thread.sleep(2000);
		//Numberusagetype
		Addzone.NumberUsageType(driver).selectByVisibleText(NumUSGType);
		//EmailAddress
		Thread.sleep(2000);
		Addzone.EmailAddress(driver).clear();
		Addzone.EmailAddress(driver).sendKeys(Email);
		Thread.sleep(2000);
		//Email usage type
		Addzone.EmailUsageType(driver).selectByVisibleText(EmailUSGType);
		//Address line1
		Addzone.Address1(driver).clear();
		Addzone.Address1(driver).sendKeys(Address1);
		Thread.sleep(1000);
		//Address line2
		Addzone.Address2(driver).clear();
		Addzone.Address2(driver).sendKeys(Address2);
		//Country
		Thread.sleep(2000);
		Addzone.Country(driver).sendKeys(Country);
		//State
		Thread.sleep(1000);
		Addzone.State(driver).sendKeys(State);
		Thread.sleep(1000);
		//City
		Addzone.City(driver).sendKeys(City);
		Thread.sleep(1000);
		//Zipcode
		Addzone.ZipCode(driver).sendKeys(Zipcode);
		Thread.sleep(1000);
		Addzone.iaccept(driver).click();
		//submit Button
		Thread.sleep(2000);
		Addzone.SubmitButton(driver).click();
		Thread.sleep(2000);	
	}
	
	public Object[][] getExcelContents(String fileName, String sheetName)
	{

		Excel1.createExcelConnection(fileName, sheetName);
		int rc = Excel1.rowCount();
		int cc = Excel1.columnCount();
		String[][] data = new String[rc - 1][cc];
		for (int r = 1; r < rc; r++) 
		{
			for (int c = 0; c < cc; c++)
			{
				data[r - 1][c] = Excel1.readData(c, r);
			}
		}
		return data;
		}
	public void myzone()
	{
		Editslot.Myzone(driver).click();
		Editslot.Getslotdetails(driver).click();
		
	}
	public  void profile() throws Exception
	{

		WebElement Myzone = driver.findElement(By.xpath(".//*[@id='sidebar-menu']/div/ul/li[2]/a"));
		Myzone.click();
		WebElement dropdown = driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/NAV[1]/UL[1]/LI[1]/A[1]"));
		Actions d = new Actions(driver);
		d.moveToElement(dropdown).click().build().perform();
		Thread.sleep(3000);
		WebElement profile = driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/NAV[1]/UL[1]/LI[1]/UL[1]/LI[1]"));
		Actions p = new Actions(driver);
		p.moveToElement(profile).click().build().perform();
		Thread.sleep(2000);
		WebElement providername = driver.findElement(By.name("n"));
		providername.clear();
		providername.sendKeys("Aditya");
		Thread.sleep(2000);
		WebElement phonenumber = driver.findElement(By.name("tn"));
		phonenumber.clear();
		phonenumber.sendKeys("9030007974");
		Thread.sleep(2000);
		WebElement usephonenum=driver.findElement(By.name("ts"));
		Select s=new Select(usephonenum);
		s.selectByValue("4");
		Thread.sleep(2000);
		WebElement changephoto = driver.findElement(By.xpath(".//button[@type = 'button']"));
		changephoto.click();
		Thread.sleep(2000);
		//when cx don't want to upload his picture, click close
		/*WebElement close = driver.findElement(By.className("btn btn-default"));
		close.click();*/
		WebElement choosefile = driver.findElement(By.name("avatar_file"));
		choosefile.sendKeys("C:\\Users\\Kamala123\\Pictures\\CameraMan\\Snapshot_201501009_170924.jpg");
		Thread.sleep(2000);
		WebElement saveit = driver.findElement(By.id("savepicture"));
		saveit.click();
		Thread.sleep(2000);
		WebElement useemail=driver.findElement(By.name("ms"));
		Select se=new Select(useemail);
		se.selectByValue("2");
		Thread.sleep(2000);
		WebElement address1 = driver.findElement(By.name("as1"));
		address1.clear();
		address1.sendKeys("Ramnagar");
		Thread.sleep(2000);
		WebElement address2 = driver.findElement(By.name("as2"));
		address2.clear();
		address2.sendKeys("Lingampally");
		Thread.sleep(2000);
		WebElement country = driver.findElement(By.id("user_country"));
		country.clear();
		country.sendKeys("India");
		Thread.sleep(2000);
		WebElement state = driver.findElement(By.id("user_state"));
		state.clear();
		state.sendKeys("Telangana");
		Thread.sleep(2000);
		WebElement city = driver.findElement(By.id("user_city"));
		city.clear();
		city.sendKeys("Hyderabad");
		Thread.sleep(2000);
		WebElement zip = driver.findElement(By.id("user_zipcode"));
		zip.clear();
		zip.sendKeys("500020");
		Thread.sleep(2000);
		
		WebElement submitprofile = driver.findElement(By.id("btn-submit"));
		submitprofile.click();
		Thread.sleep(2000);
		/*WebElement logout = driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[6]"));
		logout.click();*/
	}
	
	 
	}





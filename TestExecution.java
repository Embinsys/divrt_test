package Divrt.Dashboard;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestExecution extends Repository
{
	@Test(priority=0)
	public void verifyLaunch()
	{
		LaunchApp1();
	}
	@DataProvider(name="Divrt")
	public Object[][] creatacc1()
	{
		return getExcelContents("Inputdata.xls", "creat");
	}
	@Test(priority=1,dataProvider="Divrt")
	public void verifycrearacc1(String PhoneNo,String Email1,String Password,String RePassword) throws Exception
	{
		Creatacc(PhoneNo,Email1,Password,RePassword);
	}
	@Test(priority=2)
	public void verifyLogin() throws Exception
	{
		Login();
	}
	@DataProvider(name="Divrt1")
	public Object[][] home()
	{
		return getExcelContents("Inputdata.xls", "Home3");
	}
	@Test(priority=3,dataProvider="Divrt1")
	public void verifyhome(String Email,String Password) throws Exception
	{
		Homepage(Email,Password);
		
	}
	@DataProvider(name="Divrt2")
	public Object[][] Addzone()
	{
		return getExcelContents("Inputdata.xls","Addzone");
	}
	@Test(priority=4,dataProvider="Divrt2")
	public void verifyMyzone(String Name,String Address,String georadius,String Currency, 
			String NoLevels,String LName,String Spots,String Sensor,String Lname1,String Spots1,String Sensor1,
			String Lname2,String Spots2,String Sensor2,String MinDuration,String Mindurationprice,String PPhour,
			String conditions,String Phonenum,String NumUSGType,String Email,String EmailUSGType,String Address1,String Address2,
			String country,String state,String city,String Zipcode) throws Exception
	{
		Myzone(Name,Address,georadius,Currency,NoLevels,LName,Spots,Sensor,
				Lname1,Spots1,Sensor1,Lname2,Spots2,Sensor2,MinDuration,Mindurationprice,PPhour,conditions,Phonenum,NumUSGType,Email,EmailUSGType,Address1,Address2,
				country,state,city,Zipcode );
		
	}
	@Test(priority=5)
	public void verifymyzone()
	{
		myzone();
	}
	
	
	/*@Test(priority=4)
	public void verifyMyzone() throws Exception
	
		MyZone();
	}
	@Test(priority=5)
	public void verifyprofile() throws Exception
	{
		profile();
	}*/

	
}

package testcases.week7.day2;

import org.testng.annotations.BeforeTest;


import org.testng.annotations.Test;

import base.week7.day2.ProjectSpecificMethodsForWeek2;
import pages.week7.day2.LoginPage;

public class CreateContact extends ProjectSpecificMethodsForWeek2{

	@BeforeTest
	public void setFilename()
	{
		filename="CreateContact";
	}
	
	@Test(dataProvider="data")
	public void createContact(String fname,String lname,String contactfname	,String contactlname, String depart,String desc,
			String mail, String city, String newdesc
			) throws InterruptedException
	{
		
		System.out.println("Create Contact Testcase");
		String username = null,password=null;
		String lang = getApplicationProperties().getProperty("lang");
		if(lang.equalsIgnoreCase("en"))
		{
			username=getApplicationProperties().getProperty("username");
			password=getApplicationProperties().getProperty("password");
		}
		else
		{
			username=getApplicationProperties().getProperty("frusername");
			password=getApplicationProperties().getProperty("frpassword");
		}
		
		LoginPage lp=new LoginPage();
		lp.enterUsername(username)
		.enterPassword(password)
		.clickLogin().clickCRM_SFALink()
		.clickContacts().clickCreateConatact()
		.enterRequiredAllContactDetails(fname, lname,contactfname, contactlname, depart, desc, mail, city)
		.clickCreateContactButton().clickEditButton().updatingTheDescription(newdesc);
		
	}
}

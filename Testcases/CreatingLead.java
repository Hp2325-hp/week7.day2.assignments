package testcases.week7.day2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import base.week7.day2.ProjectSpecificMethodsForWeek2;
import pages.week7.day2.LoginPage;

public class CreatingLead extends ProjectSpecificMethodsForWeek2{

	@BeforeTest
	public void setFilename()
	{
		filename="leadsDetails";
	}
	
	@Test(dataProvider="data")
	public void createLead(String cname,String fname,String lname,String depart,String desc
			,String mail) throws InterruptedException
	{
		System.out.println("Create Lead TestCase");
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
		.clickLogin().clickCRM_SFALink().clickLeads()
		.clickCreateLead().enterLastName(lname).enterFirstName(fname).enterCompanyName(cname)
		.enterDepartDescAndMail(depart,desc,mail).selectCountry("New York")
		.clickCreateLeadButton();
	}
	
	
}

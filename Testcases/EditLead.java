package testcases.week7.day2;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import base.week7.day2.ProjectSpecificMethodsForWeek2;
import pages.week7.day2.LoginPage;

public class EditLead extends ProjectSpecificMethodsForWeek2{

	@BeforeTest
	public void setFilename()
	{
		filename="EditLeads";
	}
	
	@Test(dataProvider="data")
	public void editLead(String fname,String cname) throws InterruptedException
	{
		System.out.println("Edit Lead TestCase");
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
		.clickLeads().clickFindLeads().enterFirstName(fname).clickFindLeadButton()
		.clickFirstResult().clickOnEditButton().changeCompanyDetail(cname).clickUpdateButton()
		.confirmingCompanyNameChange(cname);
		
	}
	
}

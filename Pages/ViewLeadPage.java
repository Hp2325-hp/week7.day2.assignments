package pages.week7.day2;

import org.openqa.selenium.By;
import org.testng.Assert;


import base.week7.day2.ProjectSpecificMethodsForWeek2;

public class ViewLeadPage extends ProjectSpecificMethodsForWeek2 {

	String fid;

	public ViewLeadPage(String firstIdLink) {

		this.fid = firstIdLink;
	}

	public ViewLeadPage() {
		// TODO Auto-generated constructor stub
	}

	// EditLead
	public OpentapsCRMPage clickOnEditButton() throws InterruptedException {
		getDriver().findElement(By.xpath("//div[@class='frameSectionExtra']/a[text()='"+getLanguageProperties()
		.getProperty("link_edit")+"']")).click();
		Thread.sleep(2000);
		return new OpentapsCRMPage();
	}

	// EditLead
	// Verify company change done
	public void confirmingCompanyNameChange(String newcompanyname) {
		String company_name = getDriver().findElement(By.xpath("//td/span[@id='viewLead_companyName_sp']")).getText();
		System.out.println(company_name);

		int length = newcompanyname.length();
		String temp = company_name.substring(0, length);
		company_name = temp;
		// verify the company is same or not using assert
		Assert.assertEquals(company_name, newcompanyname);
		System.out.println("Company name updated");
	
	}

	// DuplicateLead
	public DuplicateLeadPage clickDuplicateLeadButton() throws InterruptedException {
		getDriver().findElement(By.xpath("//div[@class='frameSectionExtra']/a[text()='"+
	getLanguageProperties().getProperty("link_duplicate_lead_button")+"']")).click();
		Thread.sleep(2000);
		return new DuplicateLeadPage();
	}

	// DeleteLead
	public MyLeadsPage clickDeleteButton() throws InterruptedException {

		getDriver().findElement(By.xpath("//div[@class='frameSectionExtra']/a[text()='Delete']")).click();
		Thread.sleep(2000);
		return new MyLeadsPage(fid);
	}

}

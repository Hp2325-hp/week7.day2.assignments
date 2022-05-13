package pages.week7.day2;

import org.openqa.selenium.By;

import base.week7.day2.ProjectSpecificMethodsForWeek2;

public class MyLeadsPage extends ProjectSpecificMethodsForWeek2 {

	private String fid;

	public MyLeadsPage(String fid) {
		this.fid = fid;
	}


	public MyLeadsPage() {
		// TODO Auto-generated constructor stub
	}


	// CreateLead
	public CreateLeadPage clickCreateLead() {
		getDriver().findElement(By.linkText(getLanguageProperties().getProperty("link_create_lead"))).click();
		return new CreateLeadPage();
	}

	// EditLead
	// DuplicateLead
	// DeleteLead
	public FindLeadsPage clickFindLeads() throws InterruptedException {
		getDriver().findElement(By.xpath("//div//a[text()='"+getLanguageProperties()
		.getProperty("link_find_lead")+"']")).click();
		Thread.sleep(2000);
		return new FindLeadsPage();
	}

	// DeleteLead
	// Check the Lead is deleted or not
	public void checkTheLeadIsDeleted() throws InterruptedException {
		getDriver().findElement(By.xpath("//div//a[text()='Find Leads']")).click();
		Thread.sleep(2000);
		// searching the lead
		getDriver().findElement(By.xpath("//div[@class='x-form-element']/input[@name='id']")).sendKeys(fid);
		getDriver().findElement(By.xpath("//em/button[text()='Find Leads']")).click();
		Thread.sleep(2000);

		String result = getDriver()
				.findElement(By.xpath("//div[contains(@class,'x-small-editor')]//div[@class='x-paging-info']"))
				.getText();
		Thread.sleep(2000);

		System.out.println(result);
		// record deleted confirmation
		if (result.equals("No records to display"))
			System.out.println(fid + " Id is deleted");
		else
			System.out.println("Id is not deleted");
	}

}

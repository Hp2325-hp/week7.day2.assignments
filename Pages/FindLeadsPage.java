package pages.week7.day2;

import org.openqa.selenium.By;
import base.week7.day2.ProjectSpecificMethodsForWeek2;

public class FindLeadsPage extends ProjectSpecificMethodsForWeek2 {

	// EditLead
	public FindLeadsPage enterFirstName(String fname) {
		getDriver().findElement(By.xpath("//div[contains(@class,'x-tab-item')]//input[@name='firstName']"))
				.sendKeys(fname);
		return this;
	}

	// DuplicateLead
	public FindLeadsPage clickEmailTab() throws InterruptedException {
		getDriver().findElement(By.xpath("//em[@class='x-tab-left']//span[text()='Email']")).click();
		Thread.sleep(2000);
		return this;
	}

	// DuplicateLead
	public FindLeadsPage enterMailId(String mail) {
		getDriver().findElement(By.xpath("//div[@class='x-form-element']/input[@name='emailAddress']")).sendKeys(mail);
		return this;
	}

	// DeleteLead
	public FindLeadsPage clickPhoneTabAndEnterMobileNo(String phoneno) {
		getDriver().findElement(By.xpath("//span/span[text()='Phone']")).click();
		getDriver().findElement(By.xpath("//div/input[@name='phoneNumber']")).sendKeys(phoneno);
		return this;
	}

	// EditLead
	// DuplicateLead
	// DeleteLead
	public FindLeadsPage clickFindLeadButton() throws InterruptedException {
		getDriver().findElement(By.xpath("//em/button[text()='"+getLanguageProperties()
		.getProperty("link_find_lead_button")+"']")).click();
		Thread.sleep(2000);
		return this;
	}

	// EditLead
	// DuplicateLead
	public ViewLeadPage clickFirstResult() throws InterruptedException {
		getDriver().findElement(By.xpath("//div[contains(@class,'x-grid3-col-partyId')]/a[1]")).click();
		Thread.sleep(2000);
		return new ViewLeadPage();
	}

	// DeleteLead
	public ViewLeadPage clickFirstResultOfDeleteLeadSearch() throws InterruptedException {
		String firstIdLink = getDriver().findElement(By.xpath("//div[contains(@class,'x-grid3-col-partyId')]/a[1]"))
				.getText();
		getDriver().findElement(By.xpath("//div[contains(@class,'x-grid3-col-partyId')]/a[1]")).click();
		Thread.sleep(2000);
		return new ViewLeadPage(firstIdLink);
	}

}

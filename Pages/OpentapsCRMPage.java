package pages.week7.day2;

import org.openqa.selenium.By;

import base.week7.day2.ProjectSpecificMethodsForWeek2;

public class OpentapsCRMPage extends ProjectSpecificMethodsForWeek2 {

	// EditLead
	public OpentapsCRMPage changeCompanyDetail(String cname) {
		getDriver().findElement(By.xpath("//td/input[@id='updateLeadForm_companyName']")).clear();
		getDriver().findElement(By.xpath("//td/input[@id='updateLeadForm_companyName']")).sendKeys(cname);
		return this;
	}

	// EditLead
	public ViewLeadPage clickUpdateButton() {
		getDriver().findElement(By.name("submitButton")).click();
		return new ViewLeadPage();
	}

	// CreateContact
	// Editing the important notes
	public ViewContactPage updatingTheDescription(String newdesc) {
		getDriver().findElement(By.id("updateContactForm_description")).clear();

		getDriver().findElement(By.id("updateContactForm_importantNote")).sendKeys(newdesc);

		getDriver().findElement(By.xpath("//tr//input[@name='submitButton']")).click();

		return new ViewContactPage();
	}

}

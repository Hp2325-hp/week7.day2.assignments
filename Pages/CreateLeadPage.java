package pages.week7.day2;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.week7.day2.ProjectSpecificMethodsForWeek2;

public class CreateLeadPage extends ProjectSpecificMethodsForWeek2 {

	// CreateLead
	public CreateLeadPage enterFirstName(String fname) {
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		return this;

	}

	// CreateLead
	public CreateLeadPage enterLastName(String lname) {
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		return this;
	}

	// CreateLead
	public CreateLeadPage enterCompanyName(String cname) {
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		return this;
	}

	// CreateLead
	public CreateLeadPage enterDepartDescAndMail(String depart, String desc, String mail) {
		// depart
		getDriver().findElement(By.id("createLeadForm_departmentName")).sendKeys(depart);
		// description
		getDriver().findElement(By.id("createLeadForm_description")).sendKeys(desc);
		// mail id
		getDriver().findElement(By.id("createLeadForm_primaryEmail")).sendKeys(mail);
		return this;
	}

	// CreateLead
	public CreateLeadPage selectCountry(String country) {
		WebElement we = getDriver().findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select s = new Select(we);
		s.selectByVisibleText(country);
		return this;
	}

	// CreateLead
	public ViewLeadPage clickCreateLeadButton() {
		getDriver().findElement(By.name("submitButton")).click();
		return new ViewLeadPage();
	}

}

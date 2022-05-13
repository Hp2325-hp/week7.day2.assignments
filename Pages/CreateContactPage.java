package pages.week7.day2;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.week7.day2.ProjectSpecificMethodsForWeek2;

public class CreateContactPage extends ProjectSpecificMethodsForWeek2 {

	// CreateContact
	public CreateContactPage enterRequiredAllContactDetails(String fname, String lname, String localfname,
			String locallname, String depart, String desc, String mail, String country) {
		// provide first name
		getDriver().findElement(By.id("firstNameField")).sendKeys(fname);
		// providing last name
		getDriver().findElement(By.id("lastNameField")).sendKeys(lname);
		getDriver().findElement(By.id("createContactForm_firstNameLocal")).sendKeys(localfname);
		// providing last local name
		getDriver().findElement(By.id("createContactForm_lastNameLocal")).sendKeys(locallname);
		// Department
		getDriver().findElement(By.id("createContactForm_departmentName")).sendKeys(depart);
		// Description
		getDriver().findElement(By.id("createContactForm_description")).sendKeys(desc);
		// mail id
		getDriver().findElement(By.id("createContactForm_primaryEmail")).sendKeys(mail);
		// state selection
		WebElement we = getDriver().findElement(By.id("createContactForm_generalStateProvinceGeoId"));

		Select s = new Select(we);
		s.selectByVisibleText(country);

		return this;
	}

	// CreateContact
	public ViewContactPage clickCreateContactButton() {
		getDriver().findElement(By.xpath("//td/input[@name='submitButton']")).click();

		return new ViewContactPage();
	}

}

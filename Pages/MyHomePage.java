package pages.week7.day2;

import org.openqa.selenium.By;

import base.week7.day2.ProjectSpecificMethodsForWeek2;

public class MyHomePage extends ProjectSpecificMethodsForWeek2 {

	// CreateLead
	public MyLeadsPage clickLeads() throws InterruptedException {
		String leadlink = getLanguageProperties().getProperty("link_leads");
		getDriver().findElement(By.linkText(leadlink)).click();
		Thread.sleep(3000);
		return new MyLeadsPage();
	}

	// CreateContact //same for french and english
	public ContactsPage clickContacts() {
		getDriver().findElement(By.xpath("//div/a[text()='Contacts']")).click();
		return new ContactsPage();

	}
}

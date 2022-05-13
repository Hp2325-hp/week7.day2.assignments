package pages.week7.day2;

import org.openqa.selenium.By;
import base.week7.day2.ProjectSpecificMethodsForWeek2;

public class ContactsPage extends ProjectSpecificMethodsForWeek2 {

	// CreateContact
	public CreateContactPage clickCreateConatact() {
		getDriver().findElement(By.xpath("//a[text()='"+getLanguageProperties()
		.getProperty("link_create_contact")+"']")).click();
		return new CreateContactPage();
	}

}

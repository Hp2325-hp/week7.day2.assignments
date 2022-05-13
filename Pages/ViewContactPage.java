package pages.week7.day2;

import org.openqa.selenium.By;

import base.week7.day2.ProjectSpecificMethodsForWeek2;

public class ViewContactPage extends ProjectSpecificMethodsForWeek2 {

	// CreateContact
	// update the description  //both english and french
	public OpentapsCRMPage clickEditButton() {
		getDriver().findElement(By.xpath("//div/a[text()='"+getLanguageProperties()
		.getProperty("link_edit")+"']")).click();

		return new OpentapsCRMPage();
	}

}

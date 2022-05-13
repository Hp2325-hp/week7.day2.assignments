package pages.week7.day2;

import org.openqa.selenium.By;

import base.week7.day2.ProjectSpecificMethodsForWeek2;

public class DuplicateLeadPage extends ProjectSpecificMethodsForWeek2 {

	// DuplicateLead
	public ViewLeadPage clickCreateLeadButton() throws InterruptedException {
		getDriver().findElement(By.xpath("//td/input[@name='submitButton']")).click();
		Thread.sleep(2000);
		return new ViewLeadPage();
	}

}

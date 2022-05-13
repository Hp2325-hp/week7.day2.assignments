package pages.week7.day2;

import org.openqa.selenium.By;

import base.week7.day2.ProjectSpecificMethodsForWeek2;

public class HomePage extends ProjectSpecificMethodsForWeek2 {

	// common page
	public MyHomePage clickCRM_SFALink() {
		getDriver().findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
	}
}

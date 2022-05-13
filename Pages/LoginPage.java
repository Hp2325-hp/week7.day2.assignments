package pages.week7.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

import base.week7.day2.ProjectSpecificMethodsForWeek2;

public class LoginPage extends ProjectSpecificMethodsForWeek2 {

	
	
	
	// common page
	public LoginPage enterUsername(String uname) {
		getDriver().findElement(By.id("username")).sendKeys(uname);
		return this;
	}

	// common page
	public LoginPage enterPassword(String password) {
		getDriver().findElement(By.id("password")).sendKeys(password);
		return this;
	}

	// common page
	public HomePage clickLogin() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
		return new HomePage();
	}

}

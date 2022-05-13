package testcases.week7.day2;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExplicitWait extends BaseClass{
	
	@FindBy(how=How.XPATH,using="//button")
	WebElement hiding;
	
	
	@Test
	public void explicitWaiting()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(4));
		PageFactory.initElements(driver, this);
		wait.until(ExpectedConditions.invisibilityOf(hiding));
		boolean displayed = hiding.isDisplayed();
		//System.out.println(displayed);
		Assert.assertFalse(displayed);
		System.out.println("The Button is hidden");
	}

}

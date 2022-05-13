package base.week7.day2;

import java.io.File;


import java.io.FileInputStream;
import java.io.IOException;

import java.time.Duration;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.week7.day1.day2.ReadExcel;

public class ProjectSpecificMethodsForWeek2{

	public ChromeDriver driver;
	public String filename;
	public Properties prop;
	public Properties proplang;
	//Webdriver getter setter
	private static final ThreadLocal<WebDriver> tl=new ThreadLocal<WebDriver>();
	public void setDriver(ChromeDriver driver)
	{
		tl.set(driver);
	}
	public WebDriver getDriver()
	{
		return tl.get();
	}
	//end	
	//Application properties getter setter
	private static final ThreadLocal<Properties> tlp=new ThreadLocal<Properties>();
	public void setApplicationProperties(Properties p)
	{
		tlp.set(p);
	}
	public Properties getApplicationProperties()
	{
		
		return tlp.get();
	}
	//end
	//Languages properties getter setter
	private static final ThreadLocal<Properties> tlang=new ThreadLocal<Properties>();
	public void setLanguageProperties(Properties p)
	{
		tlang.set(p);
	}
	public Properties getLanguageProperties()
	{
		
		return tlang.get();
	}
	//end
	
	
	@DataProvider(name = "data",parallel=true)
	public String[][] getData() throws IOException {
		return ReadExcel.readExcel(filename);
	}

	@BeforeMethod
	public void preCondition() throws IOException {

		//Application Properties
		prop = new Properties();
		FileInputStream fis = new FileInputStream(new
		File("./src/main/resources/application.properties"));
		prop.load(fis);
		setApplicationProperties(prop);
		
		//Language Properties
		proplang = new Properties();
		FileInputStream fislang = new FileInputStream(new
		File("./src/main/resources/"+getApplicationProperties().getProperty("lang")+".properties"));
		proplang.load(fislang);
		setLanguageProperties(proplang);
		
		WebDriverManager.chromedriver().setup();
		setDriver(new ChromeDriver());
		getDriver().get(prop.getProperty("url"));
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@AfterMethod(enabled = false)
	public void postCondition() throws InterruptedException {
		Thread.sleep(3000);
		getDriver().close();

	}

}

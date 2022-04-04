package Genericclass;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class genericcls {
	public WebDriver driver;
	@BeforeMethod
	public void lanuchbrowser()
	{
		System.setProperty("webdriver.gecko.driver", "./sample1/geckodriver.exe");
		 driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
	}
	@AfterMethod
	
		public void  closebrowser()
		{
		driver.close();
		}
}

package javaScriptexecute;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./sample1/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=0;i<=3;i++)
		{
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(2000);
		}
			for(int i=0;i<=3;i++)
			{
			js.executeScript("window.scrollBy(0,-500)");
			Thread.sleep(1000);
		}
			
		}
}

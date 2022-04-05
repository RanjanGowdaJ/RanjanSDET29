package javaScriptexecute;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Disabled {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./sample1/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/LENOVO/Desktop/Selenium/Disabled.html");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('t1').value='world'");
	}

}

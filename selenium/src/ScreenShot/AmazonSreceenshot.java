package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonSreceenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver","./sample1/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://wwww.amazon.in/");
		TakesScreenshot ts=(TakesScreenshot)driver;
	 File temp = ts.getScreenshotAs(OutputType.FILE);
	 File hd=new File("C:\\Users\\LENOVO\\Desktop\\Selenium\\amazon.jpeg");
	 FileUtils.copyFile(temp, hd);
	
	
	}

}

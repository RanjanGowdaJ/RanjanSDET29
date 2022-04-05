package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class World3 {
public static void main(String[] args) throws InterruptedException 
{					
	String key="webdriver.gecko.driver";
	String value="./sample1/geckodriver.exe";
	System.setProperty(key,value);
	FirefoxDriver driver=new FirefoxDriver();
		Thread.sleep(4000);
		driver.close();
	}

}

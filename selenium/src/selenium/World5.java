package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class World5 
{
	public static void main(String[] args) throws InterruptedException
	{
     String key="webdriver.chrome.driver";
     String value="./sample1/chromedriver.exe";
     System.setProperty(key,value);
     ChromeDriver d1=new ChromeDriver();
     Thread.sleep(2000);
     d1.quit();
	}
}
     



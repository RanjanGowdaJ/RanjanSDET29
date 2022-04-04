package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {
	public static void main(String[] args) throws InterruptedException
	{
     
     System.setProperty("webdriver.gecko.driver","./sample1/geckodriver.exe");
     WebDriver driver=new FirefoxDriver();
     driver.get("file:///C:/Users/LENOVO/Desktop/Selenium/SrcMain.html");
     Thread.sleep(1000);
     driver.switchTo().frame(0);
     Thread.sleep(1000);
     driver.findElement(By.xpath("//input[@id='t2']")).sendKeys("abcd");
     Thread.sleep(1000);
     driver.switchTo().defaultContent();
     Thread.sleep(1000); 
     driver.findElement(By.xpath("//input[@id='t1']")).sendKeys("xyz");
     Thread.sleep(1000);
     
	}
}
     



package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Movies {
	public static void main(String[] args) throws InterruptedException
	{
     
     System.setProperty("webdriver.gecko.driver","./sample1/geckodriver.exe");
     WebDriver driver=new FirefoxDriver();
     driver.get("https://www.sacnilk.com/entertainmenttopbar/Sandalwood_Box_Office_2021?hl=en");
     Thread.sleep(1000);
     driver.findElement(By.xpath("//a[.='Marakkar: Lion of the Arabian Sea']")).click();
	}
}

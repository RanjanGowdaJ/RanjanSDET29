package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fbpage {
	public static void main(String[] args) throws InterruptedException
	{
     
     System.setProperty("webdriver.gecko.driver","./sample1/geckodriver.exe");
     WebDriver driver=new FirefoxDriver();
     driver.get("https://www.facebook.com/");
     Thread.sleep(1000);
    WebElement ele = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
    String url=ele.getAttribute("href");
    System.out.println(url);
	}
     
     

}

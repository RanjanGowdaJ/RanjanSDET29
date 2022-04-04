package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon2 {
	public static void main(String[] args) throws InterruptedException
	{
     
     System.setProperty("webdriver.gecko.driver","./sample1/geckodriver.exe");
     WebDriver driver=new FirefoxDriver();
     driver.get("https://www.amazon.in/");
     Thread.sleep(1000);
     List<WebElement> ele = driver.findElements(By.xpath("//img"));
     for (WebElement link : ele) {
    	 System.out.println(link.getAttribute("src"));
     }
     driver.close();
	}
}

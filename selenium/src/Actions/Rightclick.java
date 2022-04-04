package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {
	public static void main(String[] args) throws InterruptedException
	{
     
     System.setProperty("webdriver.gecko.driver","./sample1/geckodriver.exe");
     WebDriver driver=new FirefoxDriver();
     driver.get("http://demo.guru99.com/test/simple_context_menu.html");
     Thread.sleep(1000);
    WebElement dclick = driver.findElement(By.xpath("//span[.='right click me']"));
   
     Thread.sleep(1000);
     Actions act=new Actions(driver);
     act.contextClick(dclick).perform();
	}

}

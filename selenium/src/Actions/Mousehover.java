package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {
	public static void main(String[] args) throws InterruptedException
	{
     
     System.setProperty("webdriver.gecko.driver","./sample1/geckodriver.exe");
     WebDriver driver=new FirefoxDriver();
     driver.get("https://www.flipkart.com/");
     Thread.sleep(1000);
     driver.findElement(By.xpath("//button[.='✕']")).click();
     Thread.sleep(1000);
     WebElement ele = driver.findElement(By.xpath("(//div[.='Fashion'])[2]"));
     Actions act=new Actions(driver);
     act.moveToElement(ele).perform();
	}
     
}

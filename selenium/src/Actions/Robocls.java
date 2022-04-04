package Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Robocls {
	public static void main(String[] args) throws InterruptedException, AWTException
	{
     
     System.setProperty("webdriver.chrome.driver","./sample1/chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.facebook.com/");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']")).click();
    Thread.sleep(2000);
   // Actions act=new Actions(driver);
   // act.contextClick(dclick).perform();
    Thread.sleep(2000);
    Set<String> id = driver.getWindowHandles();
    for (String wid : id) {
   String	t=driver.switchTo().window(wid).getTitle();
   System.out.println(t);
		
	}
	
	}

}

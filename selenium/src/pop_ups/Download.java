package pop_ups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Download {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.gecko.driver", "./sample1/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	Thread.sleep(2000);
	driver.get("https://www.selenium.dev/downloads/");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[.='4.1.1']")).click();
	Thread.sleep(2000);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_LEFT);
	r.keyRelease(KeyEvent.VK_LEFT);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
}
}

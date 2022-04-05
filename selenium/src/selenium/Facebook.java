package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) throws InterruptedException
	{
     
     System.setProperty("webdriver.gecko.driver","./sample1/geckodriver.exe");
     WebDriver driver=new FirefoxDriver();
     driver.get("https://www.facebook.com/r.php");
     Thread.sleep(1000);
    WebElement ele = driver.findElement(By.id("month"));
    Thread.sleep(1000);
     Select s=new Select(ele);
     Thread.sleep(1000);
     List<WebElement> opt = s.getOptions();
     Thread.sleep(1000);
     int count = opt.size();
     Thread.sleep(1000);
System.out.println(count);
for (int i = 0; i < count; i++) {
	WebElement we = opt.get(i);
	String text = we.getText();
	System.out.println(text);
}
}
	}


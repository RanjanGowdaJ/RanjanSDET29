package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FBlocation {
	public static void main(String[] args) throws InterruptedException
	{
     
     System.setProperty("webdriver.gecko.driver","./sample1/geckodriver.exe");
     WebDriver driver=new FirefoxDriver();
     driver.get("https://www.facebook.com/");
     Thread.sleep(1000);
    WebElement ele = driver.findElement(By.xpath("//button[.='Log In']"));
    Point icon = ele.getLocation();
    System.out.println(icon);
    int x=icon.getX();
    System.out.println(x);
    int y = icon.getY();
    System.out.println(y);
	}
}
	

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fb2 {
	public static void main(String[] args) throws InterruptedException
	{
     
     System.setProperty("webdriver.gecko.driver","./sample1/geckodriver.exe");
     WebDriver driver=new FirefoxDriver();
     driver.get("https://www.facebook.com/");
     Thread.sleep(1000);
    WebElement ele = driver.findElement(By.xpath("//button[.='Log In']"));
    String text=ele.getText();
    System.out.println(text);
	}
}

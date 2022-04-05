package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {
	public static void main(String[] args) throws InterruptedException
	{
     
     System.setProperty("webdriver.gecko.driver","./sample1/geckodriver.exe");
     WebDriver driver=new FirefoxDriver();
     driver.get("http://demo.guru99.com/test/simple_context_menu.html");
     Thread.sleep(1000);
    WebElement dclick = driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
   
     Thread.sleep(1000);
     Actions act=new Actions(driver);
     
     
   /*  act.clickAndHold(dclick);
     System.out.println("hoo");
     Thread.sleep(3000);
     act.release(dclick);
     System.out.println("hii"); */
     act.doubleClick(dclick).perform();

}
}
package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	public static void main(String[] args) throws InterruptedException
	{
     
     System.setProperty("webdriver.gecko.driver","./sample1/geckodriver.exe");
     WebDriver driver=new FirefoxDriver();
     driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
     Thread.sleep(1000);
    WebElement b1 = driver.findElement(By.xpath("(//div[.='Rome'])[2]"));
    WebElement b2 = driver.findElement(By.xpath("//div[.='Italy']"));
     Thread.sleep(1000);
     WebElement b3 = driver.findElement(By.xpath("(//div[.='Seoul'])[2]"));
     WebElement b4 = driver.findElement(By.xpath("//div[.='Spain']"));
     Actions act=new Actions(driver);
     act.dragAndDrop(b1, b2).perform();
     act.dragAndDrop(b3, b4).perform();
	}

}

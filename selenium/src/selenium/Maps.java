package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Maps {
	public static void main(String[] args) throws InterruptedException
	{
     
     System.setProperty("webdriver.gecko.driver","./sample1/geckodriver.exe");
     WebDriver driver=new FirefoxDriver();
     driver.get("https://www.google.com/maps/@13.0121728,77.5684096,12z");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//button[@aria-label='Directions']")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")).sendKeys("hassan");
     Thread.sleep(2000);
     driver.findElement(By.xpath("(//button[@jsaction='search;focus:pane.focusTooltip;blur:pane.blurTooltip'])[1]")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...']")).sendKeys("mysuru");
     Thread.sleep(1000);
     driver.findElement(By.xpath("(//button[@jsaction='search;focus:pane.focusTooltip;blur:pane.blurTooltip'])[2]")).click();
	}

}

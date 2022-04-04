package pop_ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Divi {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./sample1/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[.='Tue, Dec 21'])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[.='5'])[6]")).click();
		Thread.sleep(2000);
	}
}

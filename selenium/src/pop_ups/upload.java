package pop_ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class upload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./sample1/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/LENOVO/Desktop/Selenium/Upload.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input[@id='f1']"));
		Thread.sleep(2000);
		ele.sendKeys("C:\\Users\\LENOVO\\Desktop\\Selenium\\Upload.html");
		Thread.sleep(2000);
		driver.close();

	}

}

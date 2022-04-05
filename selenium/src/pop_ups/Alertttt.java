package pop_ups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertttt {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./sample1/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		driver.findElement(By.name("cusid")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		Alert a = driver.switchTo().alert();
		Thread.sleep(2000);
		String text = a.getText();
		System.out.println(text);
		Thread.sleep(2000);
		a.accept();
		Thread.sleep(2000);
		Alert b = driver.switchTo().alert();
		Thread.sleep(2000);
		b.accept();
	}

}

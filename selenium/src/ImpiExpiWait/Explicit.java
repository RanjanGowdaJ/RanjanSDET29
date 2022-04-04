package ImpiExpiWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./sample1/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://122.166.192.191:9003");
		driver.findElement(By.xpath("//a[.='Login']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rajurajurau@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("raju123@#");
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("My Account "));
		String d = driver.getTitle();
		System.out.println(d);
	}

}

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class project {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./sample1/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://122.166.192.191:9008/?d=IN");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@class='form-control keyword has-icon']")).sendKeys("engineering");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form[@id='seach']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='http://122.166.192.191:9008/jobs-at/wipro']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[.=' Software engineer  ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@data-toggle='modal'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select [@id='report_type']")).click();
	}

}

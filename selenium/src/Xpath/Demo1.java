package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./sample1/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("all ok");
		 driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		 driver.findElement(By.xpath("//a[@href='/channel/UCEgdi0XIXXZ-qJOFPf4JSKw']")).click();
	}

}

package testNGGG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Genericclass.genericcls;

public class Sample2  extends genericcls{
	@Test
	public void test1() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("12345");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
	}

}

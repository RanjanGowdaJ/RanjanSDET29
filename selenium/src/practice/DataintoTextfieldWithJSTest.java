package practice;

import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataintoTextfieldWithJSTest {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","./sample1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		System.out.println("hiii");
		Thread.sleep(2000);
		driver.navigate().refresh();
		
	/*	String title = driver.getTitle();
		System.out.println(title);  */
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String title = (String) js.executeScript("return document.title");  //doubt
		System.out.println(title);
		
		
	//	js.executeScript("Document.getElementByID('email').value='ranjan'");
		
		
	}

}

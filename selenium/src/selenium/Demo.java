package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./sample1/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https:/www.flipkart.com/");
		Thread.sleep(2000);
		String titel = driver.getTitle();
		System.out.println(titel);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
	}

}

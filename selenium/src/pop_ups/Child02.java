package pop_ups;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Child02 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./sample1/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
		Set<String> allwh = driver.getWindowHandles();
		int count = allwh.size();
         System.out.println(count);
         for (String wh : allwh) {
	 System.out.println(wh);
}
     driver.close();
	}
}

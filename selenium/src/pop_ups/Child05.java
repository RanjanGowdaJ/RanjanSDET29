package pop_ups;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Child05 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./sample1/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
	String	pid=driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();
		int count = allwh.size();
         System.out.println(count);
         allwh.remove(pid);
        int c1=allwh.size();
        System.out.println(c1);
         for (String wh : allwh) {
        	 driver.switchTo().window(wh);
        	 String title = driver.getTitle();
        	 System.out.println(title);
        	 Thread.sleep(4000);
        	 driver.close();
         }
	}
}

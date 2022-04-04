package ImpiExpiWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class implicit {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./sample1/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		
		driver.findElement(By.xpath("//a[@class='nav-a  'and @href='/gp/goldbox?ref_=nav_cs_gb']")).click();
		
		driver.findElement(By.xpath("(//span[.='Electronics'])[1]")).click();
		
		driver.findElement(By.xpath("(//span[.='Fashion'])[1]")).click();
	}

}

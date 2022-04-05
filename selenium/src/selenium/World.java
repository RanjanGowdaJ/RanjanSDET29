package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class World {
	public static void main(String[] args) {
		
	
	String key="webdriver.chrome.driver";
	String value="./sample1/chromedriver.exe";
	System.setProperty(key,value);
	ChromeDriver driver=new ChromeDriver();
}


}

package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class World2 {public static void main(String[] args) {
	
	
String key="webdriver.gecko.driver";
String value="./sample1/geckodriver.exe";
System.setProperty(key,value);
FirefoxDriver driver=new FirefoxDriver();
}
 
}

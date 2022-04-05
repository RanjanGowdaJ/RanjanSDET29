package selenium;

	import org.openqa.selenium.chrome.ChromeDriver;
	public class world1
	{

		public static void main(String[] args) throws InterruptedException {
			
		
		String key="webdriver.chrome.driver";
		String value="./sample1/chromedriver.exe";
		System.setProperty(key,value);
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(4000);
		driver.close();
	}


}

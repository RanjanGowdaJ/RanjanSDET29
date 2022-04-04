package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class yahoo {
	public static void main(String[] args) throws InterruptedException
	{
     
     System.setProperty("webdriver.gecko.driver","./sample1/geckodriver.exe");
     WebDriver driver=new FirefoxDriver();
     driver.get("https://in.search.yahoo.com/?fr2=inr");
     Thread.sleep(1000);
     driver.findElement(By.xpath("//div[@class='text' and@title='Sign In']")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("raju123470");
     Thread.sleep(1000);
     driver.findElement(By.xpath("//input[@class='pure-button puree-button-primary challenge-button']")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("rajaram mohanroy");
     Thread.sleep(1000);
     driver.findElement(By.xpath("//button[@class='pure-button puree-button-primary puree-spinner-button challenge-button']")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//div[@class='icon mail']")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//a[@class='e_dRA l_T cn_dBP cg_FJ k_w r_P A_6EqO u_e69 p_R S_n C_52qC I_ZamTeg D_F H_6VdP gl_C ab_C en_0 M_1Eu7sD it_dRA is_1SUcgJ cZdTOHS_28Otf4']")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//input[@id='message-to-field']")).sendKeys("javaqsp@yahoo.com");
     Thread.sleep(1000);
     driver.findElement(By.xpath("//input[@class='q_T y_Z2hYGcu je_0 jb_0 X_0 N_fq7 G_e A_6EqO C_Z281SGl ir_0 P_0 bj3_Z281SGl b_0 j_n d_72FG em_N']")).sendKeys("hii bro");
     Thread.sleep(1000);
     driver.findElement(By.xpath("//button[@class='q_Z2aVTcY e_dRA k_w r_P H_6VdP s_3mS2U en_0 M_1gLo4F V_M cZ1RN91d_n y_Z2hYGcu A_6EqO u_e69 b_0 C_52qC I4_Z29WjXl it3_dRA']")).click();
     Thread.sleep(1000);
	}

}

package testNGGG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample1 {
	@Test
	public void test1()
	{
		Reporter.log("hey u", true);
	}
	@Test(dependsOnMethods="test1")
	public void test2()
	{
		Reporter.log("wt man", true);
		
	}
	@Test(dependsOnMethods="test2")
	public void test3()
	{
		Reporter.log("come her", true);
		
	}

}

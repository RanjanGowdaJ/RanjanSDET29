package testNGGG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ng1 {
	@Test
	public void test1()
	{
		Reporter.log("hello", true);
	}
@Test
public void tset2()
{
	Reporter.log("world", true);
}
}

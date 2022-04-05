package javaScriptexecute;

import java.util.Date;

public class DateReplacing {
	public static void main(String[] args) {
		Date d1=new Date();
		String re = d1.toString();
		String cd = re.replaceAll(":", "-");
		System.out.println(cd);
	}

}

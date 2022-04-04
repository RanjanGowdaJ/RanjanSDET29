package collections;

import java.util.ArrayList;

public class Sample4 {
	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		System.out.println(l1);
		if(l1.contains(20))
		{
			System.out.println("yes 20 is present");
		}
		else{
			System.out.println("20 is not present");
		}
	}

}

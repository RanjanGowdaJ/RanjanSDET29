package collections;

import java.util.ArrayList;

public class Sample7 {
	public static void main(String[] args) {
		
		
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		ArrayList a2=new ArrayList();
		a2.add(30);
		a2.add(40);
		a2.add(50);
		System.out.println("a1"+a1);
		System.out.println("a2"+a2);
		a1.removeAll(a2);
		System.out.println("a1"+a1);
		System.out.println("a2"+a2);
	}

}

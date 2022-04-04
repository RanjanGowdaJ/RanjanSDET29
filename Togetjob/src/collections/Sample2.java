package collections;

import java.util.ArrayList;

public class Sample2 {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		ArrayList a2=new ArrayList();
		a2.add('a');
		a2.add('b');
		a2.add('c');
		System.out.println("a1"+a1);
		System.out.println("a2"+a2);
		a1.addAll(a2);
		System.out.println("a1"+a1);
		System.out.println("a2"+a2);
		
		
	}

}

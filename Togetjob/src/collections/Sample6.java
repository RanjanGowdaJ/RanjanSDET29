package collections;

import java.util.ArrayList;

public class Sample6 {
	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add(10);
		l1.add(20.56);
		l1.add("hello");
		l1.add(null);
		l1.add('a');
		l1.remove(1);
		l1.remove("hello");
		for(int i=0;i<l1.size();i++)
		{
		System.out.println(l1.get(i));
		}
	}
		

}

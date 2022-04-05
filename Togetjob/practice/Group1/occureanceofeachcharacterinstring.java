package Group1;

import java.util.HashSet;
import java.util.Scanner;

public class occureanceofeachcharacterinstring {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the input");
	String str = sc.next();
	 //int count = sc.nextInt();
	HashSet<Character> set = new HashSet<Character>();
	for (int i = 0; i < str.length(); i++) {
		set.add(str.charAt(i));
	}
	for (Character ch : set) {
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			if(ch==str.charAt(i))
			{
				count++;
			}
			
		}
		System.out.println(ch+" "+count);
		
	}
	}

}

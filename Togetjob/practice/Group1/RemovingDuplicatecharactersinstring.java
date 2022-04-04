package Group1;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemovingDuplicatecharactersinstring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		String str = sc.next();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		for (Character ch : set) {
			System.out.println(ch);
			
		}
	}

}

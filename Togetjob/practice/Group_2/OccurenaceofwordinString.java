package Group_2;

import java.util.HashSet;
import java.util.Scanner;

public class OccurenaceofwordinString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		String s = sc.nextLine();
		
	//	String s="hi java hi mava";
		String[] str = s.split(" ");
		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < str.length; i++) {
			set.add(str[i]);
			
		}
		for (String word : set) {
			int count = 0;
			for (int i = 0; i < str.length; i++) {
				if(word.equals(str[i]))
				{
					count++;
				}
				
			}
			System.out.println(word+" "+count);
			
		}
	}

}

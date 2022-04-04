package Programes_2;

import java.util.HashSet;

public class SwapingofFirstandLastWordInString {
	public static void main(String[] args) {
		String s="welcome to banglore hi helo ";
		String[] str = s.split(" ");
		
	/*	HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < str.length; i++) {
			set.add(s.charAt(i));    */
		
		
			String str1=str[0];
			str[0]=str[str.length-1];
			str[str.length-1]=str1;
			for (int i = 0; i < str.length; i++) {
				System.out.print(str[i]+" ");
			}
		
		
	}

}

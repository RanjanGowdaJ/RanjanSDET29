package Group_1;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharacterfromString {
	public static void main(String[] args) {
		String s="hello";
		//Step 1=store the given string into collection by creating a set
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i <s.length(); i++) {
			set.add(s.charAt(i));
	}
		for (Character ch : set) {
			System.out.print(ch);
			
		}
	}
}

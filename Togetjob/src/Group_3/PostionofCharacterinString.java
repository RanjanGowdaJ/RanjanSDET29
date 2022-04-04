package Group_3;

import java.util.HashSet;

public class PostionofCharacterinString {
	/*public static void main(String[] args) {
		String s="automation";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			System.out.println(ch+" position is "+(i+1));
			
		}
		
	}*/
public static void main(String[] args) {
	String s="tester";
	HashSet<Character> set = new HashSet<Character>();
	for (int i = 0; i < s.length(); i++) {
		set.add(s.charAt(i));
	}
	for (Character ch: set) {
		for (int i = s.length()-1; i>=0; i--) {
			if(ch==s.charAt(i))
			{
				System.out.println(ch+" "+(i+1));
				break;
			}
			
		}
		
	}
}
}

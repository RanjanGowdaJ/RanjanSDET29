package Group_3;

import java.util.HashSet;

public class Print_only_ovel_without_Duplicate {
	public static void main(String[] args) {
		String s="India";
		s=s.toLowerCase();
		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i <s.length(); i++) {
			set.add(s.charAt(i));
			
		}
		for (Character ch : set) {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.println(ch);
			}
		 
			
		}
	}

}

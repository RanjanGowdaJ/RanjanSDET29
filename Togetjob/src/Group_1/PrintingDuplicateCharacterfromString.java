package Group_1;

import java.util.HashSet;

public class PrintingDuplicateCharacterfromString {
	public static void main(String[] args) {
		String  s="helloo";
		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i <s.length(); i++) {
			set.add(s.charAt(i));
			
		}
		//step 2=compare the given string with all the values present in the set
		for (Character ch : set) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if(ch==s.charAt(i))    //if ch is matching with s,then increment the count 
				{
				count++;  
				}
				
			}// step 4=the condition is ,count should be more 1
			if(count>1){
				System.out.println(ch+"  "+count); // step 5=print only the repeating  character and occurence of each character  
	}

}
}
}
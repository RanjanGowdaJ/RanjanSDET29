package Group_3;

public class Printing_Ovel_with_Duplicate {
	public static void main(String[] args) {
		String s="India";
		s=s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				System.out.println(s.charAt(i));
			}
			
		}
	}

}
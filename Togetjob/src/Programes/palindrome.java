package Programes;

public class palindrome {
	public static void main(String[] args) {
		String s="gadag";
		String rev="";
		for (int i = s.length()-1; i>=0; i--) 
		{
		rev=rev+s.charAt(i);	
		}
		System.out.println(rev);
		if(s.equals(rev))
		{
			System.out.println("it is a palindrome");
		}else
		{
			System.out.println("it is not a palindrome");
		}
	}

}

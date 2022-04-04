package Programes;

public class Swap2StringWithoutusing3rdvariable {
	public static void main(String[] args) {
		String s1="raja";
		String s2="ram";
		s1=s1+s2;    //raj+ram=rajaram
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println(s1);
		System.out.println(s2);
		
		
	}

}

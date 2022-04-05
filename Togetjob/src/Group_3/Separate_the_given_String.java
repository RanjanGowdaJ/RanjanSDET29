package Group_3;

public class Separate_the_given_String {
	public static void main(String[] args) {   //ASCII value A=65to and Z=90
		String ch1="";                         //ASCII value a=97 to z= 122
		String ch2="";                         // ASCII value for 0=48 to 9=57
		String ch3="";
		String s="Sala12G#$a";
		for (int i = 0; i < s.length(); i++) {
			if((s.charAt(i)>='a'&& s.charAt(i)<='z')||(s.charAt(i)>='A'&& s.charAt(i)<='Z'))
					{
				ch1=ch1+s.charAt(i);
					}
			else if(s.charAt(i)>='0'&& s.charAt(i)<='9')
			{
				ch2=ch2+s.charAt(i);
			}
			else
			{
				ch3=ch3+s.charAt(i);
				
			}
		}
		System.out.print(ch1+" "+ch2+" "+ch3);
		//System.out.println(ch2);
	    //System.out.println(ch3);
	}

}

package Programes;

public class ReversUsing3rdvaribale {
	public static void main(String[] args) {
		String value="Automation";
		String rev="";  //n on ion
		for (int i = value.length()-1; i >=0; i--) {
			rev= rev+value.charAt(i);   //n+"", o+n i+on
			
		}
		System.out.println(rev); 
		
	}

}

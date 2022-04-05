package Group_Array;

public class SeparatingTheNumberWithZeros {
	public static void main(String[] args) {
		int a[]={0,2,3,0,1,0,0};
		int b[]=new int[a.length];
		int m=0;
		int n=b.length-1;
		for (int i = 0; i < b.length; i++) {
			if(a[i]==0)
			{
				b[n]=a[i];
				n--;
			}
			else{
				b[m]=a[i];
		/*	if(a[i]>b[i])
				{
					int temp=a[i];
					a[i]=b[i];
					b[i]=temp;
				}*/
				m++;
			}
			
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
			
		}
		
	}

}

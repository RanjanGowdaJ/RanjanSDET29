package Group_Array;

public class AddingTwoArrayWithDifferentLength {
	public static void main(String[] args) {
		int a[]={1,2,3,};   //if the length of the one array is different from other array,we will get array index out 
		int b[]={5,6,7,8,6};       // of bound exception
		int count=a.length;
		if(b.length>a.length)   // in that case we have add try and Catch block to handle the Exception
		{
			count=b.length;
		}
		for (int i = 0; i < count; i++) {
			try
			{
			int sum=a[i]+b[i];
			System.out.println(sum);
			}
			catch (Exception e) {
				if(b.length>a.length)
				{
					System.out.println(b[i]);
			}
				else{
					System.out.println(a[i]);
				}
			
			}
			
		}
		}

}

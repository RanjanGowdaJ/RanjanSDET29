package Group_Array;

public class SumoffirstThreemax {
	public static void main(String[] args) {
		int[] arr={11,22,33,44,55};
		int sum =0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		for (int i = 0; i < 3; i++) {
			sum=sum+arr[i];
			//System.out.println(sum);
		}
		System.out.println(sum);

		}

}

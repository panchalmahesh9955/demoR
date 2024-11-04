package Logical_All_Programs;

public class Max_Min_Array {

	public static void main(String[] args) {
		
		
		int arr[]= {2,3,4,5,1,9,7,8};
		
		int len=arr.length;
		
		int max=arr[0];
		
		int min=arr[0];
		
		for (int i=1;i<len-1;i++) {
			if(arr[i]<min) 
				{min=arr[i];}
			
			if(arr[i]>max) 
				{max=arr[i];}
			
		}
			System.out.println("min="+min);
			System.out.println("max="+max);
		
	}

}
